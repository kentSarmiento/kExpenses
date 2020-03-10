package com.database.expenses.resources;

public class kExTimestamp {

    public static final int THIS_YEAR = 2020;
    public static final int THIS_MONTH = 03;
    public static final int THIS_DAY = 11;

    public static final int THIS_HOUR = 22;
    public static final int THIS_MIN = 38;

    private int year;
    private int month;
    private int day;

    private int hour;
    private int minutes;

    public kExTimestamp() {
        this.year = THIS_YEAR;
        this.month = THIS_MONTH;
        this.day = THIS_DAY;
        this.hour = THIS_HOUR;
        this.minutes = THIS_MIN;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

}