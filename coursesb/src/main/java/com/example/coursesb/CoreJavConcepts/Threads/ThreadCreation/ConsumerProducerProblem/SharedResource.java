package com.example.coursesb.CoreJavConcepts.Threads.ThreadCreation.ConsumerProducerProblem;

public class SharedResource {
    boolean isItemPresent=false;

    public synchronized void addItem(){
        System.out.println("Producer Thread calling the notify ");
        isItemPresent=true;
        notify();

    }

    public synchronized void consumeItem(){
        System.out.println("Consumer Thread inside consume item method");
        if(isItemPresent==false)
        {
            try {
                System.out.println("consumer thread is waiting");
                wait();
            }

            catch (Exception ex)
            {

            }
        }
        System.out.println("Consumer Thread now accessing itemPresent var due to unlock by notify ");
        isItemPresent=false;
    }
}
