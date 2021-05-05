package $$Methods;
import java.util.*;
public class MethodOverloading {

    public static int findMax(int[] nums){
        int max = nums[0];
        for (int i = 0; i< nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }

    public static double findMax(double [] nums){
        double max = nums[0];
        for (int i = 0; i< nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }


    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);
        boolean runInt = in.nextBoolean();
        int size = in.nextInt();

        if(runInt) {
            int [] arr = new int[size];
            for(int i=0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(findMax(arr));
        } else {
            double [] arr = new double[size];
            for(int i=0; i < arr.length; i++) {
                arr[i] = in.nextDouble();
            }
            System.out.println(findMax(arr));
        }

    }
}
