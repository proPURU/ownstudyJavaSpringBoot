package com.example.coursesb.CoreJavConcepts.Threads.threadPractise;

public class ThreadClass extends Thread {

    public void run(){
        System.out.println("Hello task ruuned by  "+ currentThread().getName());
    }
}
