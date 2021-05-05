package AleMele_month$$.Arrays_4_10;

import java.util.*;

/**
 Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}.
 You may modify and print the given array, or print a new array.`

 Example:

 input: 6, 2, 5, 3

 output: [2, 5, 3, 6]
 */
public class ShiftLeft {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i< nums.length; i++){
            nums[i] = s.nextInt();
        }


        int[] newArr = new int[nums.length];
        int temp = nums[0];
        for (int i = 0; i < nums.length-1; i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = temp;
        System.out.println(Arrays.toString(nums));
    }
}
