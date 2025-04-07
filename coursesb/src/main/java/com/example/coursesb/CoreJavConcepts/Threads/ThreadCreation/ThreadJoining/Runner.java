package com.example.coursesb.CoreJavConcepts.Threads.ThreadCreation.ThreadJoining;



public class Runner {

    public static void main(String[] args)  {

        SharedResource resource=new SharedResource();
        System.out.println("main thread started ");


        Thread t1=new Thread(()->{
            System.out.println("Thread 1 calling produce method ");
            resource.produce();
        });
        t1.start();
        try {
            t1.join();
        }
        catch (Exception e){

        }
        System.out.println("main thread is finished ");
    }

}
