package $$Methods;

import java.util.Arrays;

public class Akrem {
    public static void main(String[] args) {
        System.out.println(Contains(new int[]{1,1,1,2,2,6,7,8,4,3,5,3,4}, new int[]{1,1,1,3,3,5,3,4}));
    }


    public static boolean Contains (int nums[], int [] n) {
        int count = 0;
        for ( int i = 0; i < nums.length;i++){
            for (int f = 0; f < n.length; f++){
                if(nums[i] == n[f]){
                    nums[i] = 0;
                    count++;
                }
            }
        }
        return count == nums.length;
    }

}
