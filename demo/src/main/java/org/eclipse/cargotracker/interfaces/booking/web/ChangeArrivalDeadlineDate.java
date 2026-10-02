package org.eclipse.cargotracker.interfaces.booking.web;

import java.io.Serializable;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.FacesException;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.eclipse.cargotracker.interfaces.booking.facade.BookingServiceFacade;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.primefaces.PrimeFaces;

@Named
@ViewScoped
public class ChangeArrivalDeadlineDate implements Serializable {

  private static final long serialVersionUID = 1L;

  private String trackingId;
  private CargoRoute cargo;
  private Date arrivalDeadlineDate;

  @Inject private BookingServiceFacade bookingServiceFacade;

  public String getTrackingId() {
    return trackingId;
  }

  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }

  public CargoRoute getCargo() {
    return cargo;
  }

  public Date getArrivalDeadlineDate() {
    return arrivalDeadlineDate;
  }

  public void setArrivalDeadlineDate(Date arrivalDeadlineDate) {
    this.arrivalDeadlineDate = arrivalDeadlineDate;
  }

  public void load() {
    arrivalDeadlineDate = null;
    cargo = bookingServiceFacade.loadCargoForRouting(trackingId);
    if (cargo == null) {
      throw new FacesException("No cargo found for tracking ID: " + trackingId);
    }

    String date = cargo.getArrivalDeadlineDate();
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
    formatter.setLenient(false);
    ParsePosition position = new ParsePosition(0);
    Date parsedDate = date == null ? null : formatter.parse(date, position);
    if (parsedDate == null || position.getIndex() != date.length()) {
      throw new FacesException("Unable to parse cargo arrival deadline date: " + date);
    }
    arrivalDeadlineDate = parsedDate;
  }

  public void changeArrivalDeadline() {
    if (arrivalDeadlineDate == null) {
      throw new IllegalArgumentException("Arrival deadline date is required.");
    }

    bookingServiceFacade.changeDeadline(trackingId, arrivalDeadlineDate);
    PrimeFaces.current().dialog().closeDynamic("DONE");
  }
}
