package com.example.coursesb.CoreJavConcepts.interviewQsn.evenOddPrinter;

public class OddPrinter implements  Runnable{
    Printer printer;
    OddPrinter(Printer printer)
    {
        this.printer=printer;
    }
    @Override
    public void run() {


        printer.printOdd();
    }
}
