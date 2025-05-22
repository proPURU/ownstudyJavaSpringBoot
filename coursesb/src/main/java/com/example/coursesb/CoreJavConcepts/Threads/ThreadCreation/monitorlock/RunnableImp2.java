package com.example.coursesb.CoreJavConcepts.Threads.ThreadCreation.monitorlock;

public class RunnableImp2 implements Runnable{

    MonitorlockExample monitorlockExample;

    public RunnableImp2(MonitorlockExample monitorlockExample)
    {
        this.monitorlockExample=monitorlockExample;
    }
    @Override
    public void run() {
        monitorlockExample.task2();
    }
}
