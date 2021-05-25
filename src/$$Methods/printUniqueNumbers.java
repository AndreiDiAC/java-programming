package $$Methods;

import java.util.ArrayList;

public class printUniqueNumbers {
    public static void main(String[] args) {
        printUniqueNumbers(new int[] {2,5,5,6,3,6,9,34,3});
    }

    public static void printUniqueNumbers(int [] nums){
        ArrayList<Integer> output = new ArrayList<>();

        for (Integer integer : nums) {
            int count = 0;
            for (int num : nums) {
                if(integer == num){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(integer);
            }
        }
    }
}
