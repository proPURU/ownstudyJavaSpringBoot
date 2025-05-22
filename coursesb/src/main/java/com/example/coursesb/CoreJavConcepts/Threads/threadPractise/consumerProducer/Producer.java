package com.example.coursesb.CoreJavConcepts.Threads.threadPractise.consumerProducer;

public class Producer implements Runnable {

    SharedResource sharedResource;

    Producer(SharedResource sharedResource){
        this.sharedResource=sharedResource;
    }


    @Override
    public void run() {
        try {

            Thread.sleep(5000);
            sharedResource.producer();
        }catch (Exception ex){

        }
    }
}
