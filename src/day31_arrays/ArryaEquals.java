package day31_arrays;

import java.util.Arrays;

public class ArryaEquals {
    public static void main(String[] args) {
        int[] num1 = {4,12,53};
        int[] num2 = {4,12,53};

        System.out.println(Arrays.equals(num1, num2)); //true

        int[] num3 = {3,12,53};
        System.out.println(Arrays.equals(num1,num3)); //false

        int[] num4 = {3,12,53,100};
        System.out.println(Arrays.equals(num1,num4)); //false



        int[] nums1 = {4, 5, 2, 10};
        int[] nums2 = {4, 5, 2, 10};
        int[] nums3 = {10, 4, 5, 2};
        int[] nums4 = {4, 5, 2, 10, 90};
        int[] nums5 = {54, 23, 54, 123, 54};
        String[] cars1 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars2 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars3 = {"toyota","honda", "tesla","bmw", "dodge"};
        String[] cars4 = {"Toyota","Honda", "Tesla"};

        System.out.println(Arrays.equals(nums1,nums2)); //true
        System.out.println(nums1 == nums2);//check if point to same object in memory

        if(Arrays.equals(nums1,nums2)){
            System.out.println("nums1 and nums2 match");
        }else{
            System.out.println("nums1 and nums2 mis-match");
        }

        if(Arrays.equals(nums2,nums3)){
            System.out.println("nums1 and nums2 match");
        }else{
            System.out.println("nums1 and nums2 mis-match");
        }

        System.out.println(Arrays.equals(cars1,cars2));//true
        System.out.println(Arrays.equals(cars2,cars3));//false


        if(Arrays.toString(cars2).equalsIgnoreCase(Arrays.toString(cars3))){
            System.out.println("match");
        }
    }
}
