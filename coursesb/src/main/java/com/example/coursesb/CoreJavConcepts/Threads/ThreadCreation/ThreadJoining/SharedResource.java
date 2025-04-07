package com.example.coursesb.CoreJavConcepts.Threads.ThreadCreation.ThreadJoining;

public class SharedResource {


    boolean isAvailable=false;

    public synchronized void produce(){
        System.out.println("Lock acquired ");
        isAvailable=true;

        try{
            Thread.sleep(10000);
        }catch (Exception ex){

        }

        System.out.println("Lock release ");
    }
}
