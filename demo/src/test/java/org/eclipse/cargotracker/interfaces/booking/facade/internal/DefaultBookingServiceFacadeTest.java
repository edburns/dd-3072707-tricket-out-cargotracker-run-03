package org.eclipse.cargotracker.interfaces.booking.facade.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;
import org.eclipse.cargotracker.application.BookingService;
import org.eclipse.cargotracker.domain.model.cargo.Itinerary;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.junit.jupiter.api.Test;

class DefaultBookingServiceFacadeTest {

  @Test
  void changeDeadlineDelegatesConvertedTrackingIdAndSameDateOnce() throws Exception {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    BookingServiceSpy bookingService = new BookingServiceSpy();
    Field bookingServiceField =
        DefaultBookingServiceFacade.class.getDeclaredField("bookingService");
    bookingServiceField.setAccessible(true);
    bookingServiceField.set(facade, bookingService);
    Date arrivalDeadline = new Date(1_700_000_000_000L);

    facade.changeDeadline("ABC123", arrivalDeadline);

    assertEquals(1, bookingService.changeDeadlineCalls);
    assertEquals(new TrackingId("ABC123"), bookingService.trackingId);
    assertSame(arrivalDeadline, bookingService.arrivalDeadline);
  }

  private static class BookingServiceSpy implements BookingService {

    private int changeDeadlineCalls;
    private TrackingId trackingId;
    private Date arrivalDeadline;

    @Override
    public TrackingId bookNewCargo(UnLocode origin, UnLocode destination, Date arrivalDeadline) {
      return null;
    }

    @Override
    public List<Itinerary> requestPossibleRoutesForCargo(TrackingId trackingId) {
      return null;
    }

    @Override
    public void assignCargoToRoute(Itinerary itinerary, TrackingId trackingId) {}

    @Override
    public void changeDestination(TrackingId trackingId, UnLocode unLocode) {}

    @Override
    public void changeDeadline(TrackingId trackingId, Date deadline) {
      changeDeadlineCalls++;
      this.trackingId = trackingId;
      arrivalDeadline = deadline;
    }
  }
}
