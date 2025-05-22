package com.example.coursesb.CoreJavConcepts;
import  java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//
//                ArrayList<Integer> arr=new ArrayList<>();
//                arr.add(1);
//                arr.add(2);
//                arr.add(1);
//                arr.add(2);
//
//                arr.add(1);
//                arr.add(2);
//
//                arr.add(1);
//                arr.add(2);
//
//                List<Integer> ans= arr.stream().
//                        distinct().collect(Collectors.toList());
//
//                System.out.println(ans);
//                Scanner sc=new Scanner(System.in);

//                int N=sc.nextInt();
              //  int[] array=new int[N];

                int[] array={4,3,2,7,8,2,3,1};

//                for(int i=0;i<N;i++)
//                {
//                    array[i]=sc.nextInt();
//
//
//                }
            int N=array.length;

            // nums[i] != i + 1 and nums[i] != nums[nums[i] - 1]
                for(int i=0;i<N-1;i++)
                {
                    int val=array[i];

                    if(val!=i+1 && val!= array[val-1])
                    {
                        //swap
                        // swap nums[i] with nums[nums[i] - 1]

                        int a=array[i];
                        int b=array[val-1];

                        int temp=b;
                        array[val-1]=a;
                        array[i]=b;


                    }
                }

                for(int i=0;i<N;i++)
                {
                    System.out.print(array[i]+" ");
                }

    }
}
