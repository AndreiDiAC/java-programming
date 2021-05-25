package $$Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveBadPairs {
    public static void main(String[] args) {
        System.out.println(removeBadPairs(new ArrayList<>(Arrays.asList(3,4,6,1,1,10,8,7))));
    }

    public static ArrayList<Integer> removeBadPairs(ArrayList<Integer> nums){
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i < nums.size()-1; i+=2){
            if(nums.get(i) < nums.get(i+1)){
                output.add(nums.get(i));
                output.add(nums.get(i+1));
            }
        }
        return output;

    }
}
