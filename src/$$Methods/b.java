package $$Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class b {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(11);

        System.out.println("index 0 = " + nums.get(0));
        System.out.println("index 1 = " + nums.get(1));
        System.out.println("index 2 = " + nums.get(2));
        System.out.println(nums);

        nums.remove(1);// remove element at index 1;

        System.out.println(nums);

    }
}
