package $$Methods;

import java.util.Arrays;

public class PrintUniqueNumber {
    public static void main(String[] args) {
        printUniqueNumbers(new int[] {2, 5, 5, 6, 3, 6, 9, 34, 3});
    }
    public static void printUniqueNumbers(int[] nums){

        for (int i =0 ; i < nums.length;i++){
            int count = 0;
            for(int f = 0; f < nums.length; f++){
                if(nums[i] == nums[f]){
                    count ++;
                }
            }
            if(count ==  1){
                System.out.println(nums[i]);
            }
        }



    }
}
