package steamfake.graphics;

import raven.datetime.component.date.DatePicker;

import javax.swing.*;

public class DateTimeTextField extends JFormattedTextField {

    private final DatePicker datePicker;
    private String format;

    public DatePicker getDatePicker() {
        return datePicker;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public DateTimeTextField() {
        datePicker = new DatePicker();
        datePicker.setDateFormat("dd/MM/yyyy");
        datePicker.setEditor(this);
    }

}
