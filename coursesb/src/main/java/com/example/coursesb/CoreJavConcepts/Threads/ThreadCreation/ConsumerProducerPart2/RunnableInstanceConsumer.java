package com.example.coursesb.CoreJavConcepts.Threads.ThreadCreation.ConsumerProducerPart2;

public class RunnableInstanceConsumer implements Runnable {

    SharedResource obj;

    RunnableInstanceConsumer(SharedResource obj){
        this.obj=obj;
    }


    @Override
    public void run() {
        try {
            // CONSUMER HERE
            for(int i=1;i<=6;i++) {
                obj.consume();
            }

        } catch (Exception e) {

        }

    }
}
