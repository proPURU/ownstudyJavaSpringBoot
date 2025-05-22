package com.example.coursesb.CoreJavConcepts.Threads.threadPractise;

public class Runner {

    public static void main(String[] args) {

       // ThreadClass obj=new ThreadClass();
        for (int i=0;i<100;i++) {
            ThreadClass obj=new ThreadClass();
            obj.start();
        }
    }
}
