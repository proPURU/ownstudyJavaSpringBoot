package com.example.coursesb.CoreJavConcepts.interviewQsn;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arr=new ArrayList<>();

        arr.add(1);
        arr.add(2);

//        for(int val:arr)
//        {
////            if(val==2)
////            {
////                arr.remove(1);
////            }
//
//            arr.removeIf(( x)->{
//                if(x==2){
//                    return true;
//                }else {
//                    return false;
//                }
//            });
//
//
//        }

        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)==2)
            {
                arr.remove(i);
            }
        }
    }
}
