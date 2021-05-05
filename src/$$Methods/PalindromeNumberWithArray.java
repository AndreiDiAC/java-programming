package $$Methods;

import java.util.Arrays;

public class PalindromeNumberWithArray {
    public static void main(String[] args) {
        int num = 1001;
        int sameNum = num;
        int arr [] = new int[1];

        boolean isPalindrom = true;

        for ( int i = 1; num > 0; i++){
            arr = new int[i];
            num = (num - (num % 10)) /10;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sameNum % 10;
            sameNum = (sameNum-(sameNum % 10))/10;
        }

        for (int i = 0; i < arr.length/2; i++) {
            if(arr[i]!= arr[arr.length-1-i]){
                isPalindrom = false;
            }
        }
        System.out.println(isPalindrom);


    }
}


