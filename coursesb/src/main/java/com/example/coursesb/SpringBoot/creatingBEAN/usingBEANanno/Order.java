//package com.example.coursesb.creatingBEAN.usingBEANanno;
//
//
//
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//
//public class Order {
//    int orderId;
//    String itemName;
//
// //Important point only BEAN Annotation required if we pass any Parameter on the Constructor
//
//
//    public Order(int orderId,String itemName)
//    {
//        this.orderId=orderId;
//        this.itemName=itemName;
//    }
//
//    @PostConstruct
//    void print()
//    {
//        System.out.println("This BEAN is created with ctor by using BEAN ");
//
//    }
//
//
//}
