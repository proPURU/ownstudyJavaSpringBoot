package com.example.coursesb.dependencyInjection.ConstructorInjection.UnsatisfiedDependecnyInjection;

import org.springframework.stereotype.Component;

@Component
public class OfflineOrder implements Order{

    OfflineOrder()
    {
        System.out.println("Offline order get created ");
    }

}
