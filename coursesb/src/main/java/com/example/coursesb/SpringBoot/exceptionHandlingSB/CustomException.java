package com.example.coursesb.SpringBoot.exceptionHandlingSB;

import ch.qos.logback.classic.spi.ConfiguratorRank;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;


public class CustomException extends RuntimeException{


    HttpStatus status;
    String message;

    public CustomException(HttpStatus status,String message)
    {
        super(message);
        this.status=status;
//        this.message=message;

    }

    @Override
    public String getMessage(){
        return message;
    }

    public HttpStatus getStatus(){
        return status;
    }


}
