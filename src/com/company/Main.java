package com.company;
import java.io.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        new Main().MyMain();
    }

    public void MyMain() {

        try(BufferedReader br = new BufferedReader (new FileReader("input")))
        {
            ArrayList<Worker> workers = new ArrayList<>();
            String[] buff;
            String str;

            while(br.ready()){
                str = br.readLine();
                buff = str.split("[+?\\x20]|[+?\\x3A]");

                workers.add(new Worker(buff));
            }
            CountWorkers(workers);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    public void CountWorkers(ArrayList<Worker> workers){
        ArrayList<Worker> group = new ArrayList<>();
        int MaxGroupSize = 0;
        for (Worker w: workers) {
            if (MaxGroupSize < group.size()){MaxGroupSize = group.size();}
            group.clear();
            group.add(w);
            for (Worker ww: workers) {
                if (w == ww){continue;}
                if (ww.isInGroup(group)){
                    group.add(ww);
                }

            }
        }
        System.out.println(MaxGroupSize);


    }


}
