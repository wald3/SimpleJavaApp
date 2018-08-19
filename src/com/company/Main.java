package com.company;
import java.io.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        new Main().MyMain();
    }

    public void MyMain() {

        try (BufferedReader br = new BufferedReader(new FileReader("input"))) {
            ArrayList<Worker> workers = new ArrayList<>();
            String[] buff;
            String str;

            while (br.ready()) {
                str = br.readLine();
                buff = str.split("[+?\\x20]|[+?\\x3A]");
                if (IsValidString(buff)){
                    workers.add(new Worker(buff));
                }
            }
            CountWorkers(workers);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


    public static boolean IsValidString(String[] arr){
        if (arr.length != 4) return false;
        else{
            if (IsValidHour(arr[0]) && IsValidMinute(arr[1])
            &&  IsValidHour(arr[2]) && IsValidMinute(arr[3]))
                return true;
            else return false;
        }
    }

    public static boolean IsValidMinute(String s) {
        if (s.matches("\\d{2}")) {
            if (Integer.valueOf(s) <= 59 && Integer.valueOf(s) >= 00)
                return true;
            else return false;
        }
        else return false;
    }

    public static boolean IsValidHour(String s) {
        if (s.matches("\\d{2}")) {
            if (Integer.valueOf(s) <= 23 && Integer.valueOf(s) >= 00)
                return true;
            else return false;
        }
        else return false;
    }



    public void CountWorkers(ArrayList<Worker> workers){
        ArrayList<Worker> group = new ArrayList<>();
        ArrayList<Worker> maxGroup = new ArrayList<>();
        int maxGroupSize = 0;
        for (Worker w: workers) {
            if (maxGroupSize < group.size()){
                maxGroupSize = group.size();
                maxGroup = group;
            }
            group.clear();
            group.add(w);

            for (Worker ww: workers) {
                if (w == ww){continue;}
                if (ww.isInGroup(group)){
                    group.add(ww);
                }
            }
        }
        System.out.println(maxGroupSize);
        /* for test
        for (Worker w: maxGroup) {
            System.out.print(w.getID() + " ");
        }
        */
    }
}
