package org.eclipse.cargotracker.interfaces.booking.web;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.faces.FacesException;
import org.eclipse.cargotracker.interfaces.booking.facade.BookingServiceFacade;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.Location;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.RouteCandidate;
import org.junit.jupiter.api.Test;
import org.primefaces.PrimeFaces;

class ChangeArrivalDeadlineDateTest {

  @Test
  void loadRequestsCargoAndParsesItsDate() throws Exception {
    ChangeArrivalDeadlineDate bean = new ChangeArrivalDeadlineDate();
    FakeBookingServiceFacade facade = new FakeBookingServiceFacade();
    facade.cargo = cargoRoute(new Date(1_800_000_000_000L));
    injectFacade(bean, facade);
    bean.setTrackingId("ABC123");

    bean.load();

    assertEquals("ABC123", facade.loadedTrackingId);
    assertEquals(
        new SimpleDateFormat("MM/dd/yyyy").parse(facade.cargo.getArrivalDeadlineDate()),
        bean.getArrivalDeadlineDate());
  }

  @Test
  void malformedCargoDateIsSurfaced() throws Exception {
    ChangeArrivalDeadlineDate bean = new ChangeArrivalDeadlineDate();
    FakeBookingServiceFacade facade = new FakeBookingServiceFacade();
    facade.cargo =
        new CargoRoute("ABC123", "Origin", "Destination", new Date(), false, false, "", "") {
          @Override
          public String getArrivalDeadlineDate() {
            return "02/30/2026";
          }
        };
    injectFacade(bean, facade);
    bean.setTrackingId("ABC123");

    FacesException exception = assertThrows(FacesException.class, bean::load);

    assertTrue(exception.getMessage().contains("Unable to parse"));
    assertNull(bean.getArrivalDeadlineDate());
  }

  @Test
  void changeForwardsSelectedDateAndClosesOnSuccess() throws Exception {
    ChangeArrivalDeadlineDate bean = new ChangeArrivalDeadlineDate();
    FakeBookingServiceFacade facade = new FakeBookingServiceFacade();
    injectFacade(bean, facade);
    bean.setTrackingId("ABC123");
    Date selectedDate = new Date(1_900_000_000_000L);
    bean.setArrivalDeadlineDate(selectedDate);

    PrimeFaces previous = PrimeFaces.current();
    CapturingPrimeFaces primeFaces = new CapturingPrimeFaces();
    PrimeFaces.setCurrent(primeFaces);
    try {
      bean.changeArrivalDeadline();
    } finally {
      PrimeFaces.setCurrent(previous);
    }

    assertEquals(1, facade.deadlineChangeCount);
    assertEquals("ABC123", facade.changedTrackingId);
    assertEquals(selectedDate, facade.changedDeadline);
    assertTrue(primeFaces.dialogClosed);
    assertEquals("DONE", primeFaces.dialogResult);
  }

  @Test
  void nullDeadlineIsRejectedWithoutDelegation() throws Exception {
    ChangeArrivalDeadlineDate bean = new ChangeArrivalDeadlineDate();
    FakeBookingServiceFacade facade = new FakeBookingServiceFacade();
    injectFacade(bean, facade);

    assertThrows(IllegalArgumentException.class, bean::changeArrivalDeadline);

    assertEquals(0, facade.deadlineChangeCount);
  }

  @Test
  void failedFacadeCallDoesNotCloseDialog() throws Exception {
    ChangeArrivalDeadlineDate bean = new ChangeArrivalDeadlineDate();
    FakeBookingServiceFacade facade = new FakeBookingServiceFacade();
    IllegalStateException failure = new IllegalStateException("update failed");
    facade.changeFailure = failure;
    injectFacade(bean, facade);
    bean.setTrackingId("ABC123");
    Date selectedDate = new Date(1_900_000_000_000L);
    bean.setArrivalDeadlineDate(selectedDate);

    PrimeFaces previous = PrimeFaces.current();
    CapturingPrimeFaces primeFaces = new CapturingPrimeFaces();
    PrimeFaces.setCurrent(primeFaces);
    try {
      assertThrows(IllegalStateException.class, bean::changeArrivalDeadline);
    } finally {
      PrimeFaces.setCurrent(previous);
    }

    assertEquals(1, facade.deadlineChangeCount);
    assertEquals("ABC123", facade.changedTrackingId);
    assertEquals(selectedDate, facade.changedDeadline);
    assertFalse(primeFaces.dialogClosed);
  }

  private static CargoRoute cargoRoute(Date deadline) {
    return new CargoRoute("ABC123", "Origin", "Destination", deadline, false, false, "", "");
  }

  private static void injectFacade(
      ChangeArrivalDeadlineDate bean, BookingServiceFacade bookingServiceFacade) throws Exception {
    Field field = ChangeArrivalDeadlineDate.class.getDeclaredField("bookingServiceFacade");
    field.setAccessible(true);
    field.set(bean, bookingServiceFacade);
  }

  private static class CapturingPrimeFaces extends PrimeFaces {

    private boolean dialogClosed;
    private Object dialogResult;
    private final Dialog dialog =
        new Dialog() {
          @Override
          public void closeDynamic(Object data) {
            dialogClosed = true;
            dialogResult = data;
          }
        };

    @Override
    public Dialog dialog() {
      return dialog;
    }
  }

  private static class FakeBookingServiceFacade implements BookingServiceFacade {

    private CargoRoute cargo;
    private String loadedTrackingId;
    private int deadlineChangeCount;
    private String changedTrackingId;
    private Date changedDeadline;
    private RuntimeException changeFailure;

    @Override
    public String bookNewCargo(String origin, String destination, Date arrivalDeadline) {
      return null;
    }

    @Override
    public CargoRoute loadCargoForRouting(String trackingId) {
      loadedTrackingId = trackingId;
      return cargo;
    }

    @Override
    public void assignCargoToRoute(String trackingId, RouteCandidate route) {}

    @Override
    public void changeDestination(String trackingId, String destinationUnLocode) {}

    @Override
    public void changeDeadline(String trackingId, Date arrivalDeadline) {
      deadlineChangeCount++;
      changedTrackingId = trackingId;
      changedDeadline = arrivalDeadline;
      if (changeFailure != null) {
        throw changeFailure;
      }
    }

    @Override
    public List<RouteCandidate> requestPossibleRoutesForCargo(String trackingId) {
      return Collections.emptyList();
    }

    @Override
    public List<Location> listShippingLocations() {
      return Collections.emptyList();
    }

    @Override
    public List<CargoRoute> listAllCargos() {
      return Collections.emptyList();
    }
  }
}
