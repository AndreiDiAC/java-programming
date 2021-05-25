package $$Methods;

import java.util.Arrays;
import java.util.*;
public class MergeArrays {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(mergR(new int[]{1,2,3}, new int[] {4,5,6})));
        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        int [] nums2 = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(mergR(nums, nums2)));
    }


    public static int [] mergR(int[] a, int [] b){
        int [] arrMerge = new int[a.length + b.length];

        for( int i = 0; i < a.length; i++){
            arrMerge[i] = a[i];
        }
        int z = a.length;
        for( int j = 0; j < b.length; j++){
            arrMerge[z] = b[j];
            z++;
        }
        return arrMerge;
    }
}
