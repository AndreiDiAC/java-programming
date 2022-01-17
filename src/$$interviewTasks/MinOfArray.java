package $$interviewTasks;

import java.util.Arrays;

public class MinOfArray {

    public static void main(String[] args) {

        int [] arr = new int[] {1,2,35,62,682,14,2};

        int min = arr[1];

        for (int each : arr) {
            if(each < min){
                min = each;
            }
        }

        System.out.println(min);

    }


    public static int minValue(int [] arr){

        Arrays.sort(arr);

        return arr[0];

    }
}
