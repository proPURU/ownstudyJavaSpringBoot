package com.example.coursesb.CoreJavConcepts.Threads.threadPractise.consumerProducer;

public class SharedResource {

    public boolean itemPresent = false;

    public synchronized void producer(){

        itemPresent=true;
        System.out.println("In producer method and notify the // call other lock to relaease ");
        notify();
    }



    public synchronized  void  consumer(){

        if(itemPresent==false)
        {
            System.out.println("waiting for relase the lock ");
            try {
                wait();
            }
            catch (Exception ex){

            }
        }

        itemPresent=false;
        System.out.println("Consumed item ");
    }
}
