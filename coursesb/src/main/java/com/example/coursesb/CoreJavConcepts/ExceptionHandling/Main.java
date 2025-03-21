//package com.example.coursesb.CoreJavConcepts.ExceptionHandling;
//
//public class Main {
//
//    public static void main(String[] args) {
//        try {
//            Main.method1();
//            Main.method2();
//        }
//        catch (ArithmeticException ex )
//        {
//            System.out.println("Hey "+ex);
//        }
//
//        catch (ClassNotFoundException ex)
//        {
//            System.out.println("Hey "+ex);
//        }
//
//        finally {
//            System.out.println("this block will get executed no matter what ");
//        }
//
//    }
//
//    // THIS is for all Unchecked and Checked exception
//
//    /* we can handle the  exception or also if we dont handle no issues
//        in that case have to handle in main method or the caller method
//     */
//
//    // UNCHECKED EXCEPTION
//    // WE CAN WRITE OR NOT WRITE or ADD " THROWS " to the method signature
//    public static void method1() throws ClassNotFoundException {
//
//
//        //we can handle here or
//        try {
//            throw new ArithmeticException();
//        }
//        catch (Exception ex)
//        {
//           System.out.println(ex);
//        }
//        // IF we dont handle then it will be handled by caller method
//        throw new ArithmeticException();
//    }
//    // CHECKED EXCEPTION
//    // WE HAVE TO ADD " THROWS " to the method signature
//    public static void method2() throws ClassNotFoundException {
//
//        //we can handle here or
//        try {
//                throw new ClassNotFoundException();
//        }
//        catch (Exception ex)
//        {
//           System.out.println(ex);
//        }
//
//        // IF we dont handle then it will be handled by caller method
//        throw new ArithmeticException();
//    }
//
//}
//
//
