package com.example.coursesb.CoreJavConcepts.interviewQsn.StreamIvQsn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {

        List<Employee> arr= Arrays.asList(
                new Employee("Emp1 ","Male"),
                new Employee("Emp1 ","Male"),
                new Employee("Emp1 ","Male"),
                new Employee("Emp1 ","Female"),
                new Employee("Emp1 ","Male")


                    );

//        List<Employee> ans1 = arr.stream()
//                .filter(x -> x.gender.trim().equals("Male")).collect(Collectors.toList());

//
//        List<Employee> ans = arr.stream()
//                .filter((x)->{
//                    if((x.gender).equals("Male"))
//                    {
//                        return true;
//                    }else {
//                        return false;
//                    }
//                }).collect(Collectors.toList());
//        System.out.println(ans.size());
//



        Long count = arr.stream()
                .filter((x)->{
                    if((x.gender).equals("Male"))
                    {
                        return true;
                    }else {
                        return false;
                    }
                }).count();


        System.out.println(count);



    }
}
