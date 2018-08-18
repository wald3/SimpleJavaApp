package com.company;

import java.util.ArrayList;

public class Worker {

    private Time startTime;
    private Time endTime;

    private Time workTime;

    private static int counter = 1;
    private int id;

    public Worker(String[] timeArr){
        this.id = counter++;

        this.startTime = new Time(timeArr[0], timeArr[1]);
        this.endTime = new Time(timeArr[2], timeArr[3]);

        this.workTime = endTime.subtract(startTime);
    }
    public Time getStartTime(){
        return this.startTime;
    }

    public Time getEndTime(){
        return this.endTime;
    }

    public Time getWorkTime(){
        return this.workTime;
    }

    private boolean isMet(Worker w){
        if (this.getStartTime().getHours() > w.getEndTime().getHours() ||
            this.getStartTime().getHours() == w.getEndTime().getHours() &&
            this.getStartTime().getMinutes() > w.getEndTime().getMinutes() ||
            this.getEndTime().getHours() < w.getStartTime().getHours() ||
            this.getEndTime().getHours() == w.getStartTime().getHours() &&
            this.getEndTime().getMinutes() < w.getStartTime().getMinutes())
            { return false; }
        else{ return true;  }
    }

    private boolean isMoreHardworking(Worker w){
        if (this.getWorkTime().getHours() >  w.getWorkTime().getHours()){
            // THIS is more hardworking than W
            return true;
        }
        else{
            // THIS isn`t more hardworking than W,
            // or they are equals on work-progress,
            return false;
        }
    }

    private boolean isWorkTogether(Worker w){
        if (this.isMoreHardworking(w)){
            // if THIS is more hardworking
            return this.isMet(w);
        }
        else{
            return w.isMet(this);
        }
    }

    public boolean isInGroup(ArrayList<Worker> group) {
        for (Worker groupW : group) {
            if (!this.isWorkTogether(groupW)) {
                return false;
            }
        }
        return true;
    }

    public int getID(){
        return this.id;
    }


}
