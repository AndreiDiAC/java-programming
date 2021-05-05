package $$Methods;

import java.util.Arrays;

public class FibonacciNumbers {
    public static void main(String[] args) {
        fib(8);
    }

    public static void fib(int num){
        int [] arr = new int[num+1];   //because we need the index of 8 so we need length 9
        int first = 0;
        int second = 1;
        arr[0] = first;
        arr[1] = second;
        for (int i = 2; i < arr.length; i++){
            arr[i] = first + second;
            first = second;
            second = arr[i];
        }
        System.out.println(Arrays.toString(arr));

    }
}
//todo