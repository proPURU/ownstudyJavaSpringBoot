package com.example.coursesb.CoreJavConcepts.Threads.ThreadCreation.ConsumerProducerProblem;

public class Runner
{
    public static void main(String[] args) {


        // Object of shared resource need to pass
        SharedResource sharedResourceObj=new SharedResource();
        //object of runnable need to pass
        RunnableInstance runnableInstanceObj=new RunnableInstance(sharedResourceObj);
        Thread producer= new Thread(runnableInstanceObj);



        Thread consumeThread=new Thread(()->{
            sharedResourceObj.consumeItem();
        });

        producer.start();
        consumeThread.start();


    }
}
