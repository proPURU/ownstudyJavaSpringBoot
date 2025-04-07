package com.example.coursesb.CoreJavConcepts.Threads.ThreadCreation.ThreadLifeCycle;

public class MonitorLockExample {

    public synchronized void task1(){ //monitor lock by thread 1
        try{
            System.out.println("Inside task1");
            Thread.sleep(10000);
            System.out.println("Task1 after synchronized ");
        }catch(Exception e)
        {

        }
    }

    public void task2(){
        System.out.println("task2 , but before synchronized ");
        synchronized (this){
            System.out.println("task2 , inside synchronizd ");
        }
    }

    public void task3(){
        System.out.println("task 3");
    }
}
/* Summary ->
    How threads worked here ->


    All 3 threads working on the same object okay

    So when Thread 1 enter the task 1 as the method is synchronized he wants lock because of sleep time

    Threads 2 enter the task 2 but after first sysout he also want lock of the task2 but but this same object is already locked by thread 1

    Now threads 3 enter the task3 and printed the output

    Now thread 1 complete the wait time and after execution open the lock

    Now thread 2 got the lock and Executed and then released the threads


 */