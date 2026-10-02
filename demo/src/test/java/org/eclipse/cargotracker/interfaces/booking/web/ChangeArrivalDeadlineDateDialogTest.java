package org.eclipse.cargotracker.interfaces.booking.web;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.primefaces.PrimeFaces;

class ChangeArrivalDeadlineDateDialogTest {

  @Test
  void showDialogOpensDeadlineViewWithTrackingIdAndOptions() {
    ChangeArrivalDeadlineDateDialog launcher = new ChangeArrivalDeadlineDateDialog();
    CapturingPrimeFaces primeFaces = new CapturingPrimeFaces();

    PrimeFaces previous = PrimeFaces.current();
    PrimeFaces.setCurrent(primeFaces);
    try {
      launcher.showDialog("DEF789");
    } finally {
      PrimeFaces.setCurrent(previous);
    }

    assertTrue(launcher instanceof Serializable);
    assertEquals("/admin/dialogs/changeArrivalDeadlineDate.xhtml", primeFaces.outcome);
    assertEquals(Map.of("trackingId", List.of("DEF789")), primeFaces.parameters);
    assertEquals(Boolean.TRUE, primeFaces.options.get("modal"));
    assertEquals(Boolean.TRUE, primeFaces.options.get("draggable"));
    assertEquals(Boolean.FALSE, primeFaces.options.get("resizable"));
    assertEquals(410, primeFaces.options.get("contentWidth"));
    assertEquals(280, primeFaces.options.get("contentHeight"));
  }

  @Test
  void cancelClosesDialogWithEmptyResult() {
    ChangeArrivalDeadlineDateDialog launcher = new ChangeArrivalDeadlineDateDialog();
    CapturingPrimeFaces primeFaces = new CapturingPrimeFaces();

    PrimeFaces previous = PrimeFaces.current();
    PrimeFaces.setCurrent(primeFaces);
    try {
      launcher.cancel();
    } finally {
      PrimeFaces.setCurrent(previous);
    }

    assertTrue(primeFaces.dialogClosed);
    assertEquals("", primeFaces.dialogResult);
  }

  private static class CapturingPrimeFaces extends PrimeFaces {

    private String outcome;
    private Map<String, Object> options;
    private Map<String, List<String>> parameters;
    private boolean dialogClosed;
    private Object dialogResult;
    private final Dialog dialog =
        new Dialog() {
          @Override
          public void openDynamic(
              String outcome, Map<String, Object> options, Map<String, List<String>> params) {
            CapturingPrimeFaces.this.outcome = outcome;
            CapturingPrimeFaces.this.options = options;
            CapturingPrimeFaces.this.parameters = params;
          }

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
}
