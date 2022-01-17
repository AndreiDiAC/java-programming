package $$interviewTasks;

import java.util.*;
import java.util.stream.Collectors;

public class maximumNumber {

    public static void main(String[] args) {

        System.out.println(maxNumb3(new int[]{1,2,27,5,4,44,3,66}));

    }

    public static int maxNumb(int [] arr){
        int temp = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(temp < arr[i]){
                temp = arr[i];
            }
        }

        return temp;
    }

    public static int maxNumb2(int [] arr){

        int max = arr[0];

        for(int each : arr){
            if(each > max){
                max = each;
            }
        }

        return max;
    }

    public static int maxNumb3(int [] arr) {

        Arrays.sort(arr);

        return arr[arr.length-1];

    }

}
