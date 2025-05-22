package com.example.coursesb.SpringBoot.exceptionHandlingSB;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandling {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<?> handleCustomException(CustomException ex)
    {
        return new ResponseEntity<>(ex.message,ex.getStatus());
    }
}
