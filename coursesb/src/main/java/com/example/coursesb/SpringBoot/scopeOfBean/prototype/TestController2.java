//package com.example.coursesb.scopeOfBean.prototype;
//
//import com.example.coursesb.scopeOfBean.Singletone.User;
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.config.ConfigurableBeanFactory;
//import org.springframework.context.annotation.Scope;
//import org.springframework.web.bind.annotation.RestController;
//@RestController
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//public class TestController2 {
//
//
//    @Autowired
//    User user;
//
//
//
//    public TestController2()
//    {
//        System.out.println("TestController1 instance initialized ");
//    }
//
//    @PostConstruct
//    public void init()
//    {
//        System.out.println("Test Controller 2 Objet HashCode "+this.hashCode()+ " User Object HashCode "+user.hashCode());
//    }
//
//
//}
//
