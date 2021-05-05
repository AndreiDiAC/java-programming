package AleMele_month$$.Arrays_4_10.ArraysBefore10;

import java.util.Scanner;

public class FindMaxRepliT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int max = nums[0];
        for(int each: nums){
            if(each > max){
                max = each;
            }
        }
        System.out.println(max);
    }
}
