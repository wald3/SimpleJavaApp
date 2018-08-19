package com.company;

import org.junit.Test;

import static com.company.Main.IsValidString;
import static org.junit.Assert.*;

public class MainTest {


    @Test
    public void isValidString1() {
        String testSting = "08";
        assertEquals(true, IsValidString(testSting));
    }

    @Test
    public void isValidString2() {
        String testSting = "-1";
        assertEquals(false, IsValidString(testSting));
    }

    @Test
    public void isValidString3() {
        String testSting = "24";
        assertEquals(false, IsValidString(testSting));
    }
}