//package com.example.coursesb.dependencyInjection.ConstructorInjection;
//
//
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.stereotype.Component;
//
//@Component
//public class User {
//
//    Order order;
//   // Invoice invoice;
//
//
//
//
//// NORMAL SCENARIO
////    @Autowired
////    public User(Order order)
////    {
////        this.order=order;
////        System.out.println("User initalized ");
////    }
//
//    // DIFFERENT SCENARIO I HAVE TWO CONSTRUCTOR
//
////    public User(Order order)
////    {
////        this.order=order;
////        System.out.println("User initalized ");
////    }
//
////    @Autowired
////    public User(Invoice invoice)
////    {
////        this.invoice=invoice;
////        System.out.println("User initalized ");
////    }
//
//    // It is giving error as Dosent know which ctor to use for Object creation
//    // so make one ctor as @Autowired
//
//    //SPECIAL SCENARIO
//    // Making field as final
//
//
////    private final Order order;
////
////    public User(Order order)
////    {
////        this.order=order; //here o
////
////        System.out.println("User created and Final Object of order as DI ");
////    }
//
//// LAZY INITIALIZATION LIFECYCLE
//
//    /* Here the When User is getting created it send proxy to Order object due to the Lazy But when We try to access the
//    Order it inject the real Object
//     */
//
////    public  User( @Lazy Order order)
////    {
////        this.order=order;
////
////        System.out.println("User is initilized ");
////
////            System.out.println("For Lazy loading is the Order created with null value " + order.getClass().getName());
////
////
////    }
////
////
////
////    @PostConstruct
////    public void afterUserCreate()
////    {
////        System.out.println("This Order is created or not check "+order.toString());
////    }
//
//
//
//}
