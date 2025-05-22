package com.example.coursesb.CoreJavConcepts.pack.basics;

import java.util.ArrayList;
import java.util.List;

public class LambdasClient {

    public static void main(String[] args) {
        Runnable task=()->{
            System.out.println("Hey ");
        };


        Thread th=new Thread(task);
        th.start();


        List<Integer> l=new ArrayList<>();

        l.add(31);
        l.add(22);
        l.add(14);
        l.add(46);
        l.add(5);


        
    }
}
