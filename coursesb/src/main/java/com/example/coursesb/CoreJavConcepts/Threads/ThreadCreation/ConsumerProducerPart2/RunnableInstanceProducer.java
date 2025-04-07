package com.example.coursesb.CoreJavConcepts.Threads.ThreadCreation.ConsumerProducerPart2;

import com.example.coursesb.CoreJavConcepts.Threads.ThreadCreation.ConsumerProducerProblem.RunnableInstance;

public class RunnableInstanceProducer implements  Runnable {

    SharedResource obj;
    public RunnableInstanceProducer(SharedResource obj){
        this.obj=obj;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            //PRODUCER HERE
            for(int i=1;i<=6;i++) {
                obj.produced(i);
            }
        } catch (Exception e) {

        }
    }
}
