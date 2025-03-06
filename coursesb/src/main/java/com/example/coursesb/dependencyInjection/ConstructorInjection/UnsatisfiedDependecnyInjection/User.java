package com.example.coursesb.dependencyInjection.ConstructorInjection.UnsatisfiedDependecnyInjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {


    // THIS ABOVE CODE GIVING ERROR

    //TWO FIX THER 1) @Primary 2) QUALIFIER


    //PRimary can be used on which object we want to create  maybe first OnlineOrder then Offline Order

//
//    Order order;
//
//    public User(Order order)
//    {
//        System.out.println("User bean created ");
//        this.order=order;
//    }



    //QUALIFIER -> Same as before on the first class what we want to create first and inject and
    // @Qualifier in Dependency injection field
//    @Qualifier("OnlineOrderName")
//    @Autowired
//    Order order;
//
//    public User(Order order)
//    {
//        System.out.println("User bean created ");
//        this.order=order;
//    }

}
