package com.example.coursesb.CoreJavConcepts.pack.streameExcercise;

import ch.qos.logback.core.encoder.EchoEncoder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Client {

    public static void main(String[] args) {

        List<Item> items=new ArrayList<>();

        Clothing tshirt=new Clothing("C1", "T-Shirt", 19.99, 100, "M");

        Book java =new Book("B1", "Java Programming", 1599.99, 0, "John Doe");
        items.add(tshirt);
        items.add(java);
        //
        items.add(new Electronics("E1", "Laptop", 999.99, 5, 24));
        items.add(new Clothing("C1", "T-Shirt", 19.99, 100, "M"));
        items.add(new Book("B1", "Java Programming", 59.99, 50, "John Doe"));






        Electronics laptop = new Electronics("E1", "Laptop", 10, 5, 24);
        Electronics mobilePhone = new Electronics("E2", "Mobile", 5000, 10, 12);
        Electronics earphones = new Electronics("E3", "Earphones", 500, 0, 12);


        Inventory<Electronics> inventory = new Inventory<>();
        try {
            inventory.add(laptop);
            inventory.add(mobilePhone);
            inventory.add(earphones);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        Inventory<Item> inventory2 = new Inventory<>();
        try {
            inventory2.add(laptop);
            inventory2.add(mobilePhone);
            inventory2.add(earphones);
            inventory2.add(java);
            inventory2.add(tshirt);
        } catch (Exception ex){

            System.out.println(ex.getMessage());
        }

        List<Item> itmelist1= inventory2.getAll();


        /* Task 1: Stream Basics and Map Transformation
                1. Print all item IDs in the inventory using map.
                    a. Use map and forEach to execute it
                2. Create a list of item names in lowercase and print it.
                    a. Hint : Use toLowerCase method of String along with map
                3. Generate a list of the lengths of item names.
                    a. Use length method of String along with map
         */

        System.out.println(" Check "+ itmelist1.size() );

       itmelist1.stream()
                        .map((item) ->{
                            return item.getId();
                                }).forEach((id)-> System.out.println(id));

       itmelist1.stream()
               .map((item )->  {
           return item.getName().toLowerCase();
        }).forEach((name)-> System.out.println(name));

                itmelist1.stream()
                        .map((item )->  {
                            return item.getName().length();
                        }).forEach((len)-> System.out.println(len));


     List<String> ans=   itmelist1.stream()
               .map((item )->  {
           return item.getName().toLowerCase();
                 })
             .collect(Collectors.toList());

                itmelist1.stream()
                        .map((item )->  {
                            return item.getName().length();
                        }).forEach((len)-> System.out.println(len));



        itmelist1.stream().
        filter((x)->
        {
            double val=x.getPrice();

            if( val>1000 )
            {
                return true;
            }else {
                return false;
            }
        }
        ).forEach( ( z)->
                {
            System.out.println(z.getName() );
                });


        // NEXT ONE

//        Task 2: Filtering and Matching
//        Goal: Practice filtering and matching conditions with streams.
//                Practice:
        //  1      Find all items priced above 1000 and print their details.
        //  2      Check if any item in the inventory has a quantity of 0 using anyMatch.
        //   3     Verify that all items have a price greater than 0 using allMatch.
        //  4      Confirm that no item has a negative quantity using noneMatch

    boolean flag= itmelist1.stream()
            .anyMatch((item)-> item.getQuantity()==0);
    System.out.println("check outof stock with any macth "+flag);

// task 2
        //Functionality All match

        //allMatch check with all the value and if one value failed the condition it return T or F.
     boolean flag3=   itmelist1.stream().allMatch((item)-> {
            if(item.getPrice()>0){
                return true;
            }else {
                return false;
            }
        });

     System.out.println(flag3);

        boolean flag4=   itmelist1.stream().noneMatch((item)-> {
            if(item.getQuantity()>0){
                return true;
            }else {
                return false;
            }
        });

        System.out.println(flag4);


    /*Task 3 :
            Assume the inventory contains various items (e.g., electronics, clothing, books) with attributes like name, price, quantity. Write a program to achieve the following using a single stream pipeline:
            Filter items with a price greater than 1000 and a quantity greater than 0 (available stock).
            Extract only the names of these items.
            Remove duplicate names (if any).
            Sort the names in alphabetical order.
            Limit the result to the top 5 names.
            Collect the final list into a List<String> and print it.


             */


            List<String> ans5= itmelist1.stream()
                    .filter((item)-> {
                        if (item.getPrice() > 1000 && item.getQuantity() > 0) {
                            return true;
                        } else {
                            return false;
                        }
                    })
                    .map((item)->item.getName().toLowerCase())
                    // Remove duplicate names (if any).
                    .distinct()
                    // Sort the names in alphabetical order.
                    .sorted()
                    //Limit the result to the top 5 names.
                    .limit(5)
                    .collect(Collectors.toList());

            System.out.println(ans5);

            ///  task 4 5 6



    }
}
