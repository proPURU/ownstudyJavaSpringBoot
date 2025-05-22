package com.example.coursesb.CoreJavConcepts.interviewQsn.StreamIvQsn;

import com.example.coursesb.CoreJavConcepts.pack.basics.Streams;
import com.example.coursesb.Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Check {

    public static void main(String[] args) {

        ArrayList<Integer> arr= new ArrayList<>(List.of(1,2,3,4,5,6,7));


        long val=
                arr.stream()
                        .filter((x)->{
                            if(x%2==0)
                            {
                                return  true;
                            }else {
                                return false;
                            }
                        }).map(x-> x*x).count();

    }
}
