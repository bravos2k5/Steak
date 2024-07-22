package steamfake.utils;

import java.util.Objects;

public class MonthYear {

    private int month;
    private int year;

    public MonthYear(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MonthYear monthYear = (MonthYear) o;
        return month == monthYear.month && year == monthYear.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, year);
    }

}
