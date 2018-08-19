package com.company;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTest {

    @org.junit.Test
    public void subtractTest() {
        Time time1 = new Time(12,0);
        Time time2 = new Time(12,1);
        Time expected = new Time(0,1);
        time1 = time1.subtract(time2);
        assertEquals(expected, time1);
    }

    @Test
    public void setHours() {
        int expected = 2;
        Time testTime = new Time(0, 0);
        testTime.setHours(expected);
        assertEquals(expected, testTime.getHours());
    }

    @Test
    public void setMinutes() {
        int expected = 3;
        Time testTime = new Time(0, 0);
        testTime.setMinutes(expected);
        assertEquals(expected, testTime.getMinutes());
    }

    @Test
    public void getHours() {
        int expected = 5;
        Time testTime = new Time(5, 0);
        assertEquals(expected, testTime.getHours());
    }

    @Test
    public void getMinutes() {
        int expected = 5;
        Time testTime = new Time(5, 0);
        assertEquals(expected, testTime.getHours());
    }

    @Test
    public void equals1() {
        Time testTime = new Time(0, 0);
        assertEquals(true, testTime.equals(testTime));
    }

    @Test
    public void equals2() {
        Time testTime = new Time(0, 0);
        Time fakeTime = new Time(2, 0);
        assertEquals(false, testTime.equals(fakeTime));
    }

    @Test
    public void equals3() {
        Time testTime = new Time(3, 0);
        Time trueTime = new Time(3, 0);
        assertEquals(true, testTime.equals(trueTime));
    }
}