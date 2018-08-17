package com.company;

import java.util.ArrayList;

public class Worker {

    private WorkingTime workingTime;
    private static int counter = 0;
    private int id;

    public Worker(String[] timeArr){
        this.id = counter++;
        this.workingTime = new WorkingTime(timeArr);
    }

    private boolean isMet(Worker w){
        if (this.workingTime.GetStartTime().GetHours() > w.workingTime.GetEndTime().GetHours() ||
            this.workingTime.GetEndTime().GetHours() < w.workingTime.GetStartTime().GetHours()){
            return false;
        }
        else{ return true; }
    }

    private boolean isMoreHardworking(Worker w){
        if (this.workingTime.GetWorkTime().GetHours() >  w.workingTime.GetWorkTime().GetHours()){
            // THIS is more hardworking than W
            return true;
        }
        else{
            // THIS isn`t more hardworking than W,
            // or they are equals on work-progress,
            return false;
        }
    }

    public boolean isWorkTogether(Worker w){
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

    public int GetID(){
        return this.id;
    }


}
