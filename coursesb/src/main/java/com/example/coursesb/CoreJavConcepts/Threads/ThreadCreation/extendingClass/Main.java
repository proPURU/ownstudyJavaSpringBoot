package com.example.coursesb.CoreJavConcepts.Threads.ThreadCreation.extendingClass;



public class Main {

    public static void main(String[] args) {


        System.out.println("Going inside main extends thread wala Mehtod "+ Thread.currentThread().getName());
        ExtendingThread thread=new ExtendingThread();

        thread.start();
        System.out.println("Finish main Methods "+Thread.currentThread().getName());
    }
}
