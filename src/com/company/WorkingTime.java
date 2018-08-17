package com.company;

public class WorkingTime {

    private Time startTime;
    private Time endTime;

    private Time workTime;

    public WorkingTime(String[] arr){
        this.startTime = new Time(arr[0], arr[1]);
        this.endTime = new Time(arr[2], arr[3]);

        this.workTime = endTime.Subtract(startTime);
    }

    public Time GetWorkTime(){
        return this.workTime;
    }

    public Time GetStartTime(){
        return this.startTime;
    }

    public Time GetEndTime(){
        return this.endTime;
    }

}
