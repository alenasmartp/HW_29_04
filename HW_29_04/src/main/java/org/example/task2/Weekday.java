package org.example.task2;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekDay() {
        return ordinal() < 5;
    }

    public boolean isWeeekEnd() {
        return ordinal() > 5;
    }

    private int ordinal() {
        return ordinal();
    }

}