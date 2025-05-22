package com.example.coursesb.CoreJavConcepts.interviewQsn.evenOddPrinter;

public class Printer {

    int max;
    int counter;

    // if counter is even then print
    // when im printing even then i will say wait odd thread and after print notify

    Printer(int max,int counter)
    {
        this.max=max;
        this.counter=counter;
    }

    public synchronized  void printEven(){

        while(counter<=max){

            if(counter%2!=0)
            {
                try {
                    wait();
                }catch (Exception ex)
                {

                }
            }else {
                System.out.println("print ->"+Thread.currentThread().getName()+"  "+counter);
                counter++;
                notify();
            }


        }


    }




    // if counter is odd then print odd
    // when im printing odd thread i will say wait even thread and after print odd i will notify


    public synchronized void printOdd(){
        while(counter<=max){

            if(counter%2==0)
            {
                try {
                    wait();
                }catch (Exception ex)
                {

                }
            }else {
                System.out.println("print ->"+Thread.currentThread().getName()+"  "+counter);
                counter++;
                notify();

            }


        }

    }



}
