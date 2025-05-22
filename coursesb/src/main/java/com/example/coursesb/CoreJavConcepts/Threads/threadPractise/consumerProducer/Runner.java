package com.example.coursesb.CoreJavConcepts.Threads.threadPractise.consumerProducer;

public class Runner {
    public static void main(String[] args) {

        SharedResource obj=new SharedResource();

        Consumer cobj=new Consumer(obj);
        Producer pobj=new Producer(obj);
        Thread th1=new Thread(cobj);
        Thread th2=new Thread(pobj);


        th1.start();
        th2.start();

    }
}
