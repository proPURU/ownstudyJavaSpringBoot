package com.example.coursesb.CoreJavConcepts.Threads.threadPractise.consumerProducer;

public class Consumer  implements  Runnable{

    SharedResource sharedResource;

    Consumer(SharedResource sharedResource){
        this.sharedResource=sharedResource;
    }

    @Override
    public void run() {
        sharedResource.consumer();
    }
}
