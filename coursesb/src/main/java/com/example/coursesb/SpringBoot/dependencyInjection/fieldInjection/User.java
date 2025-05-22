//package com.example.coursesb.dependencyInjection.fieldInjection;
//
//
//import jakarta.annotation.PostConstruct;
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Getter
//@Setter
//@Component
//public class User {
//    int userid;
//    String name;
//
//    @Autowired
//    Order order;
//    // This is field injection
//
//    //this is described how the Injected or Order bean is created after User bean by reflection.
//
//    public User()
//    {
//        System.out.println("Constructor: User created!");
//        System.out.println("Order is not created so check id"+order);
//    }
//
//
//    @PostConstruct
//    void method()
//    {
//        System.out.println("Bean of Order is created "+order);
//    }
//}
