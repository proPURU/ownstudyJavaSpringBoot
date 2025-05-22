package com.example.coursesb.CoreJavConcepts.Threads.ThreadCreation.monitorlock;

public class RunnableImp3 implements Runnable {

    MonitorlockExample monitorlockExample;
    public RunnableImp3(MonitorlockExample monitorlockExample)
    {
      this.monitorlockExample=monitorlockExample;
    }

    @Override
    public void run() {
        monitorlockExample.task3();
    }
}
