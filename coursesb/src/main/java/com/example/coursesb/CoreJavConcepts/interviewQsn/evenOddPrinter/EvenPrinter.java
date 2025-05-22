package com.example.coursesb.CoreJavConcepts.interviewQsn.evenOddPrinter;

public class EvenPrinter  implements  Runnable{
    Printer printer;
    EvenPrinter(Printer printer)
    {
        this.printer=printer;
    }


    @Override
    public void run() {


        printer.printEven();
    }
}
