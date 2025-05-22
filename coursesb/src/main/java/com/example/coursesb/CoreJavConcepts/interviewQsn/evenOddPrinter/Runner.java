package com.example.coursesb.CoreJavConcepts.interviewQsn.evenOddPrinter;

public class Runner {
    public static void main(String[] args) {

        Printer printerObj=new Printer(20,0);

        EvenPrinter runnablEv=new EvenPrinter(printerObj);
        OddPrinter runnablOd=new OddPrinter(printerObj);

        Thread t1=new Thread(runnablEv);
        Thread t2=new Thread(runnablOd);

        t1.start();
        t2.start();
    }
}
