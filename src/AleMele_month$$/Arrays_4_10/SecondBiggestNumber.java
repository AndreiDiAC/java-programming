package AleMele_month$$.Arrays_4_10;

import java.util.Arrays;

/**
 [IQ] Second Biggest Number
 Given an Array of numbers. Find and print the 2nd biggest number. Note
 the 2nd biggest should be unique meaning it should be different from
 the max number
 Example:
 Input:
 [4,3,1,4,5,2,4,8,4,8]
 Output:
 5
 */
public class SecondBiggestNumber {
    public static void main(String[] args) {
        int[] nums = {9, 3, -1, 4, 5, 2, 4, 8, 4, 8};
        Arrays.sort(nums);
//        int maxNums = nums[nums.length - 1];
//        for (int i = nums.length - 1; i > 0; i--) {
//            if (nums[i] != maxNums) {
//                System.out.println(nums[i]);
//                break;
//            }
//        }


        int biggest = nums[0];
        for( int i = 1; i < nums.length; i++){
            if(nums[i] > biggest){
                biggest = nums[i];
            }
        }


        int min = nums[0];
        for (int i = 0; i < nums.length; i++){
            if(min > nums[i]){
                min = nums[i];
            }
        }

        int secBig = min;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != biggest){
                if(secBig < nums[i]){
                    secBig = nums[i];
                }
            }
        }
        System.out.println("min = " + min);
        System.out.println("biggest = " + biggest);
        System.out.println("second big = " + secBig);
    }
}
