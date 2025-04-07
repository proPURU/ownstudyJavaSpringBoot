package com.example.coursesb.CoreJavConcepts.Threads.ThreadCreation.ThreadLifeCycle;

public class MonitorThread1Runnable implements Runnable{

    MonitorLockExample obj;

    MonitorThread1Runnable(MonitorLockExample obj)
    {
        this.obj=obj;
    }

    @Override
    public void run(){
        obj.task1();
    }
}
