package day33_arrays;

import java.util.Arrays;

public class ReverseArray1 {
    public static void main(String[] args) {
        //Assign the array value into a new reverse Array


        int[] nums = {5,10,4,100};
        int[] numsReverse = new int[nums.length];
        System.out.println(Arrays.toString(nums));


        for (int i = nums.length-1; i >= 0; i--){
            numsReverse[i] = nums[nums.length-1-i];
        }
        System.out.println(Arrays.toString(numsReverse));


        //or

        for (int i = nums.length-1, f = 0; i >=0; i--,f++ ){
            numsReverse[f] = nums[i];
        }
        System.out.println(Arrays.toString(numsReverse));
    }
}
