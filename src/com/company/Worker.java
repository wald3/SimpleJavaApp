package com.company;

public class Worker {

    private WorkingTime workingTime;
    private static int counter = 0;
    private int id;

    public Worker(String[] timeArr){
        this.id = counter++;
        this.workingTime = new WorkingTime(timeArr);
    }

    public int GetID(){
        return this.id;
    }


}
