package com.example.coursesb;

public class Interview {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,56,7,8,9,40};



        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;


        for(int i=0;i<arr.length;i++)
        {
            int val=arr[i];

            if(val>max1)
            {
                max2=max1;
                max1=val;
            }
            if(val>max2 && val<max1)
            {
                max2=val;
            }
        }

        System.out.println(max2);

    }
}
