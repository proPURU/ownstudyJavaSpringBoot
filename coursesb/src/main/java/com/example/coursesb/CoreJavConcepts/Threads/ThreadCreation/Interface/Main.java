package com.example.coursesb.CoreJavConcepts.Threads.ThreadCreation.Interface;

public class Main {

    public static void main(String[] args) {


        System.out.println("Going inside main Mehtod "+ Thread.currentThread().getName());
        MultiThreadLearning runnableObj=new MultiThreadLearning();

        Thread thread=new Thread(runnableObj);

        thread.start();
        System.out.println("Finish main Methods "+Thread.currentThread().getName());
    }
}
