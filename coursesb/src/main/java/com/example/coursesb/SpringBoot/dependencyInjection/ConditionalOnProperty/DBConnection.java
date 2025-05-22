//package com.example.coursesb.dependencyInjection.ConditionalOnProperty;
//
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.Objects;
//
//
//@Component
//public class DBConnection {
//
//    @Autowired(required = false)
//    MySqlConnection mySqlConnection;
//
//    @Autowired(required = false)
//    NoSQLConnection noSQLConnection;
//
//    @PostConstruct
//    void init()
//    {
//        System.out.println("DBConnection Bean created with dependencies below ");
//
//        System.out.println("is MySQL Object as NULL ?? "+ Objects.isNull(mySqlConnection));
//        System.out.println("is NoSQL Object as NULL ?? "+ Objects.isNull(noSQLConnection));
//
//    }
//
//}
