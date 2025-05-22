package com.example.coursesb.CoreJavConcepts.Threads.threadPractise.byRunnable;

public class Implementer implements  Runnable{
    @Override
    public void run() {
        System.out.println("This task executed by "+ Thread.currentThread().getName());
    }
}
