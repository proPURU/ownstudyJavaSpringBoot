package com.example.coursesb.CoreJavConcepts.Threads.threadExecutor;

import org.springframework.scheduling.concurrent.CustomizableThreadFactory;

import java.util.concurrent.*;

public class Runner {


    public static void main(String[] args) {

        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(
                2 ,
                4 ,
                10,
                TimeUnit.MINUTES ,
                new ArrayBlockingQueue<>(2),
                new CustomizableThreadFactory() ,
                new Runner().new CustomRejectHandler());

        for(int i=1;i<=10;i++)
        {

            threadPoolExecutor.submit(new MyTask());
           // System.out.println("task processes by "+Thread.currentThread().getName());
        }
    }


    class CustomThreadFactory implements ThreadFactory{

        @Override
        public Thread newThread(Runnable r) {
            Thread th=new Thread(r);
            th.setPriority(Thread.NORM_PRIORITY);
            th.setDaemon(false);
            return th;
        }
    }

      class CustomRejectHandler implements  RejectedExecutionHandler{

        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            System.out.println(" Task rejected ");
        }
    }
}
