package com.example.coursesb.CoreJavConcepts.Threads.ThreadCreation.ConsumerProducerPart2;

public class Runner {
    public static void main(String[] args) {



        SharedResource sharedResourceObj=new SharedResource(3);
        RunnableInstanceConsumer runnableInstanceConsumerObj=new RunnableInstanceConsumer(sharedResourceObj);

        RunnableInstanceProducer runnableInstanceProducerObj=new RunnableInstanceProducer(sharedResourceObj);


        Thread thread1=new Thread(runnableInstanceConsumerObj);
        Thread thread2=new Thread(runnableInstanceProducerObj);


        thread1.start();
        thread2.start();

    }
}
