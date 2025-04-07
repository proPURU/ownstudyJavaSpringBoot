package com.example.coursesb.CoreJavConcepts.Threads.ThreadCreation.ConsumerProducerPart2;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {

    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResource(int bufferSize)
    {
        sharedBuffer=new LinkedList<>();
        this.bufferSize=bufferSize;
    }

    public synchronized void produced(int item) throws Exception{
        while(sharedBuffer.size()==bufferSize) {
            System.out.println("Buffer is full, Producer is waiting for consumer");
            wait();
        }
        sharedBuffer.add (item);

        System.out.println("Produced "+item);

        notify();
    }


    public synchronized  int consume() throws Exception{

        while(sharedBuffer.isEmpty()){
            System.out.println("Buffer is empty and Consumer is waiting for producer ");
            wait();
        }

        int item=sharedBuffer.poll();

        System.out.println("Consumed "+item);
        notify();
        return item;

    }


}
