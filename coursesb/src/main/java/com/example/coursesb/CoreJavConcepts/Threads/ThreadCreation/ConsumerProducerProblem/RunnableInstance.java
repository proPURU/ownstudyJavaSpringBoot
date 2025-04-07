package com.example.coursesb.CoreJavConcepts.Threads.ThreadCreation.ConsumerProducerProblem;

public class RunnableInstance implements  Runnable{

    SharedResource obj;

    RunnableInstance(SharedResource obj)
    {
        this.obj=obj;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
           // throw new RuntimeException(e);
        }
        obj.addItem();
    }
}
