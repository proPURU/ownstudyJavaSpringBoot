package com.example.coursesb.exceptionHandlingSB;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception")
public class Controller1 {

//    @GetMapping("response")
//    public String getResponse()
//    {
//        throw new CustomException(HttpStatus.BAD_REQUEST,"this is exception ");
//    }



//    @GetMapping(value = "response1", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<?> getResponse1()
//    {
//        try{
//            throw new CustomException(HttpStatus.BAD_REQUEST ,"Custom exception this is ");
//        }
//        catch(CustomException ex)
//        {
//            ErrorResponse errorResponse = new ErrorResponse(new Date(), ex.getMessage(), ex.getStatus().value());
//           // System.out.println("HEYYYYYYYYYYYYYYYYY    " + errorResponse.getMsg() +" ");
//            return new ResponseEntity<>(errorResponse,ex.getStatus());
//        }
//
//    }


    @GetMapping("response2")
    public ResponseEntity<?> getResponse2()
    {
        throw new CustomException(HttpStatus.BAD_REQUEST,"This is controlled by controller");
    }


//    @ExceptionHandler(CustomException.class)
//    public ResponseEntity<?> response(CustomException ex)
//    {
//          //One way
//         //  return new ResponseEntity<>(ex.getMessage(),ex.getStatus());
//        // Second way
//        ErrorResponse errorResponse = new ErrorResponse(new Date(), ex.getMessage(), ex.getStatus().value());
//       // System.out.println("HEYYYYYYYYYYYYYYYYY    " + errorResponse.getMsg() +" ");
//        return new ResponseEntity<>(errorResponse,ex.getStatus());
//    }

//    @ExceptionHandler({CustomException.class })
//    public ResponseEntity<?> response(CustomException ex)
//    {
//        ErrorResponse errorResponse = new ErrorResponse(new Date(), ex.getMessage(), ex.getStatus().value());
//        // System.out.println("HEYYYYYYYYYYYYYYYYY    " + errorResponse.getMsg() +" ");
//        return new ResponseEntity<>(errorResponse,ex.getStatus());
//    }



//    // If only one exception is getting handled
//    @ExceptionHandler(CustomException.class )
//    public void handleCustomException1(HttpServletResponse response,  CustomException ex) throws Exception {
//        response.sendError(HttpStatus.BAD_REQUEST.value(),ex.getMessage());
//    }
//
//    // If more than one exception getting handled
//
//    @ExceptionHandler(CustomException.class )
//    public void handleCustomException2(HttpServletResponse response,  Exception ex) throws Exception {
//        // in this case we have to use only one Exception the mother Class of exception as a parameter inside this method
//        response.sendError(HttpStatus.BAD_REQUEST.value(),ex.getMessage());
//    }



}
