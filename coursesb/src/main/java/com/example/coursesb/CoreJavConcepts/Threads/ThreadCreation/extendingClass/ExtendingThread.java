package com.example.coursesb.CoreJavConcepts.Threads.ThreadCreation.extendingClass;

public class ExtendingThread extends Thread{

    @Override
    public void run(){
        System.out.println("Code executed by Thread "+Thread.currentThread().getName());
    }

}
