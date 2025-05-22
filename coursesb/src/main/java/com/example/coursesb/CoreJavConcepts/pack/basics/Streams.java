package com.example.coursesb.CoreJavConcepts.pack.basics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

        List<Integer> list=List.of(2,4,5,6,7,8,9,20,11,12,12);


        Stream<Integer> stream=list.stream();

        List<Integer> l1= stream.
                filter((x)->{
                    System.out.println(" filtering "+ x);

                    if(x%2==0)
                    {
                        return true;
                    }else {
                        return false;
                    }

                })
                .sorted()
                .map((x)-> {
                    System.out.println("Map works "+ x);
                    return x*x;
                })
             //   .map((x)-> x*x) // we can use like this as well
                .distinct()
                .collect(Collectors.toList());


        System.out.println(l1);
    }
}
