//package com.example.coursesb.scopeOfBean.Singletone;
//
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//public class TestController1 {
//
//    @Autowired
//    User user;
//
//    public TestController1()
//    {
//        System.out.println("TestController1 instance initialized ");
//    }
//
//    @PostConstruct
//    public void init()
//    {
//        System.out.println("Test Controller 1 Objet HashCode "+this.hashCode()+ " User Object HashCode "+user.hashCode());
//    }
//
//
//}
