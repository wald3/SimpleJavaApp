package com.company;

import org.junit.Test;

import static com.company.Main.IsValidHour;
import static com.company.Main.IsValidMinute;
import static com.company.Main.IsValidString;
import static org.junit.Assert.*;

public class MainTest {


    @Test
    public void isValidHour() {
        String testSting = "08";
        assertEquals(true, IsValidHour(testSting));
    }

    @Test
    public void isValidStringTest() {
        String[] testTimes = {"09","20", "10","35"};
        assertEquals(true, IsValidString(testTimes));
    }

    @Test
    public void isValidMinute() {
        String testSting = "54";
        assertEquals(true, IsValidMinute(testSting));
    }
}