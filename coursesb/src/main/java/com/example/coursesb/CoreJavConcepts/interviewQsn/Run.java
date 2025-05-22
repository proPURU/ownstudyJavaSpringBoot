package com.example.coursesb.CoreJavConcepts.interviewQsn;

import java.util.Arrays;

public class Run {

    public static void main(String[] args) {
        int[] arr={3,2,4,1,7};
        Run.zigZag(arr);
    }


    public static void zigZag(int[] arr) {

        int N = arr.length;

        char flag = 'b';

        for (int i = 1; i < N - 1; i++) {
            int l = arr[i - 1];
            int r = arr[i + 1];
            int c = arr[i];

            if (flag == 'b') {
                //check both side and swap with i+1
                //check l & r
                if (l > c || r > c) {
                    if (l > c && l > r) {
                        //swap with left
                        int temp = l;
                        arr[i - 1] = arr[i];
                        arr[i] = temp;

                    } else if (r > c && r > l) {
                        // swap with right
                        int temp = arr[i + 1];
                        arr[i + 1] = arr[i];
                        arr[i] = temp;
                    }


                }
                flag = 's';
            }
            else
            {
                //check both side and swap with i+1
                if (l < c || r < c) {
                    if (l < c && l < r) {
                        //swap with left
                        int temp = l;
                        arr[i - 1] = arr[i];
                        arr[i] = temp;

                    } else if (r < c && r < l) {
                        // swap with right
                        int temp = arr[i + 1];
                        arr[i + 1] = arr[i];
                        arr[i] = temp;
                    }


                }
                flag = 'b';
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
