package com.example.coursesb.CoreJavConcepts.Threads.ThreadCreation.Interface;

public class MultiThreadLearning implements Runnable{



        @Override
        public void run () {

        System.out.println("This thread run by " + Thread.currentThread().getName());
    }


}
