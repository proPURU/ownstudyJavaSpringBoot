package com.example.coursesb.CoreJavConcepts.Threads.ThreadCreation.monitorlock;

import com.example.coursesb.CoreJavConcepts.Threads.threadPractise.ThreadClass;

public class Runner {

    public static void main(String[] args) {
        MonitorlockExample obj=new MonitorlockExample();

        RunnableImp1 obj1=new RunnableImp1(obj);

        RunnableImp2 obj2=new RunnableImp2(obj);

        RunnableImp3 obj3=new RunnableImp3(obj);

        Thread th1=new Thread(obj1);
        Thread th2=new Thread(obj2);
        Thread th3=new Thread(obj3);

        th1.start();
        th2.start();
        th3.start();


//        Thread th1=new Thread(()->{obj.task1();});
//        Thread th2=new Thread(()->{obj.task2();});
//        Thread th3=new Thread(()->{obj.task3();});
//
//        th1.start();
//        th2.start();
//        th3.start();

    }
}
