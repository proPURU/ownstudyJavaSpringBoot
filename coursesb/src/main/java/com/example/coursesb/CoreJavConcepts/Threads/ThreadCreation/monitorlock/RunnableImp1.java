package com.example.coursesb.CoreJavConcepts.Threads.ThreadCreation.monitorlock;

public class  RunnableImp1 implements  Runnable{
    
    MonitorlockExample monitorlockExample;

    public RunnableImp1(MonitorlockExample monitorlockExample)
    {
        this.monitorlockExample=monitorlockExample;
    }
    @Override
    public void run() {
        monitorlockExample.task1();
        
    }
}
