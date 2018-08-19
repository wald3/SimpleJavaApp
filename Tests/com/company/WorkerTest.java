package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class WorkerTest {
    Worker worker = new Worker(new
            String[]{"08","00","12","00"});

    @Test
    public void getStartTime() {
        Time testTime = new Time(8, 0);
        assertEquals(testTime, worker.getStartTime());
    }

    @Test
    public void getEndTime() {
        Time testTime = new Time(12, 0);
        assertEquals(testTime, worker.getEndTime());
    }

    @Test
    public void getWorkTime() {
        Time testTime = new Time(4, 0);
        assertEquals(testTime, worker.getWorkTime());
    }
}