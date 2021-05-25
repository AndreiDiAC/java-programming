package $$Methods;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class a {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,2,2,2,3,4,5,5));
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(10,10,20));




        System.out.println(nums);

        nums.addAll(1,num2);
        System.out.println(nums);

        Collections.addAll(nums,100000);
        System.out.println(nums);


    }
}
