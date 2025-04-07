package com.example.coursesb.exceptionHandlingSB;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Date;



public class ErrorResponse {

   Date date;
    String msg;
     int status;

    public ErrorResponse(Date date,  String msg, int status) {
        this.date = date;
        this.msg = msg;
        this.status = status;
    }


    public void setMsg(String msg)
    {
        this.msg=msg;
    }

    public String getMsg()
    {
        return  msg;
    }









}
