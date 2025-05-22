package com.example.coursesb.CoreJavConcepts.Threads.ThreadCreation.monitorlock;

import java.util.Optional;

public class MonitorlockExample {

   public synchronized void  task1(){

       try{
           System.out.println("inside task1");
           Thread.sleep(5000);

       }catch (Exception ex){

       }
   }


   public void task2(){
       System.out.println("task2 before synchrnized");
       synchronized (this){
           System.out.println("task2 inside the synchronized ");
       }
   }

   public void task3(){
       System.out.println("inside task3");
   }
}
