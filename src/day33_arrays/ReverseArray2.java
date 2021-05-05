package day33_arrays;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        int temp = 0;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


        System.out.println("----------------------------------------");

        int[] nums = {5,10,4,100};

        System.out.println("Before swap: " + Arrays.toString(nums));

        temp = nums[0];
        nums[0] = nums[3];
        nums[3] = temp;
        System.out.println("After 1st and last element swap: " + Arrays.toString(nums));

        System.out.println("Reverse through loop in the same Array variable");
        int[] nums2 = {5,10,4,100};
            for (int i = 0; i < nums2.length/2; i++){
                int temp2 = nums2[i];
                nums2[i] = nums2[nums2.length-1-i];
                nums2[nums2.length-1-i] = temp2;
            }
        System.out.println(Arrays.toString(nums2));


        System.out.println();



    }
}
