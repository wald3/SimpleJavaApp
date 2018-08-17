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

    public void SetHours(int h) {
        this.hours = h;
    }

    public void SetMinutes(int m) {
        this.minutes = m;
    }

    public int GetHours() {
        return this.hours;
    }

    public int GetMinutes() {
        return this.minutes;
    }

    public Time Subtract(Time d) {
        Time result = new Time(this.GetHours() - d.GetHours(),
                               this.GetMinutes() - d.GetMinutes());
        if (result.GetHours() < 0) {
            result.SetHours(0 - result.GetHours());
        }
        if (result.GetMinutes() < 0) {
            result.SetMinutes(0 - result.GetMinutes());
        }
        return result;
    }


}
