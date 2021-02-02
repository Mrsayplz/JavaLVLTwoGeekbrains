package ru.geekbrains.homeworkone;

public enum DayOfWeek {
    Monday(1),
    Tuesday(2),
    Wednesday(3),
    Thursday(4),
    Friday(5),
    Saturday(6),
    Sunday(7);

    private int numOfDay;

    DayOfWeek(int numOfDay) {
        this.numOfDay = numOfDay;
    }

    public int getnumOfDay() {
        return numOfDay;
    }
}
