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
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }
}
