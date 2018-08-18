package com.company;

public class Time {


    private int hours;
    private int minutes;

    public Time(String h, String m) {
        this.hours = Integer.valueOf(h);
        this.minutes = Integer.valueOf(m);
    }

    public Time(int h, int m) {
        this.hours = h;
        this.minutes = m;
    }

    public void setHours(int h) {
        this.hours = h;
    }

    public void setMinutes(int m) {
        this.minutes = m;
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (other == this) return true;
        if (!(other instanceof Time)) return false;
        Time otherMyClass = (Time) other;
        if (this.getHours() == ((Time) other).getHours() &&
                this.getMinutes() == ((Time) other).getMinutes()) {
            return true;
        }else   return false;
    }

    public Time subtract(Time d) {
        Time result = new Time(this.getHours() - d.getHours(),
                               this.getMinutes() - d.getMinutes());
        if (result.getHours() < 0) {
            result.setHours(0 - result.getHours());
        }
        if (result.getMinutes() < 0) {
            result.setMinutes(0 - result.getMinutes());
        }
        return result;
    }


}
