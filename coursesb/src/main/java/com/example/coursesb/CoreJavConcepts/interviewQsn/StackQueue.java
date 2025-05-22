package com.example.coursesb.CoreJavConcepts.interviewQsn;

import java.util.*;

public class StackQueue {

    public static void main(String[] args) {

        //stack will act like queue

//        Queue<Integer> qq=new ArrayDeque<>();
//
//        for(int i=0;i<5;i++)
//        {
//            qq.add(i);
//        }
//
//        System.out.println(qq);
//
//
//        while(qq.size()>0)
//        {
//            System.out.println(qq.poll());
//        }


//        Stack<Integer> st=new Stack<>();
//
//        for(int i=0;i<5;i++)
//        {
//            st.push(i);
//        }
//
//        System.out.println(st);
//
//        while(st.size()>0)
//        {
//            System.out.println(st.pop());
//        }


//        Stack<Integer> st1=new Stack<>();
//        for(int i=0;i<5;i++)
//        {
//            st1.push(i);
//        }
//        System.out.println(st1);
//
//        Stack<Integer> st2=new Stack<>();
//
//        for(int i=0;i<5;i++) {
//            System.out.println(StackQueue.custompoll(st1, st2));
//        }






    }


    public static int custompoll(Stack<Integer> st1, Stack<Integer> st2)
    {
        int ans=-1;

       // int st1Size=st1.size();

        while(st1.size()>1)
        {
            st2.push(st1.pop());
        }

        if(st1.size()>0) {
            ans = st1.pop();
        }

        while(st2.size()>0)
        {
            st1.push(st2.pop());
        }


        return ans;
    }
}
