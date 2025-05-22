//package com.example.coursesb.scopeOfBean.prototype;
//
//
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.config.ConfigurableBeanFactory;
//import org.springframework.context.annotation.Scope;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//public class TestController1 {
//
//
//    @Autowired
//    User user;
//
//    @Autowired
//    Student student;
//
//    public TestController1()
//    {
//        System.out.println("TestController1 instance initialized ");
//    }
//
//    @PostConstruct
//    public void init()
//    {
//        System.out.println("Test Controller 1 Objet HashCode "+this.hashCode()+ " User Object HashCode "+user.hashCode() +" Student HashCode "+student.hashCode());
//    }
//
//
//}
