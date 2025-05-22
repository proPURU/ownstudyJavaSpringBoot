package com.example.coursesb.CoreJavConcepts.Threads.threadPractise.byRunnable;

public class Runner {

    public static void main(String[] args) {

        Implementer imp=   new Implementer();
        Thread obj1 = new Thread(imp);
        for (int i=0;i<100;i++) {

            obj1.start();

        }
    }
}
