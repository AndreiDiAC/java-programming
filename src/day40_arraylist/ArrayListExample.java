package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(6);
        nums.add(9);
        //nums.add("java"); ERROR
        System.out.println("size = " + nums.size());

        //reading from ArrayList
        System.out.println("index 0 = " + nums.get(0));
        System.out.println("index 1 = " + nums.get(1));

        //print all values in same line:
        System.out.println(nums); //

        //remove element at index 1
        nums.remove(1);
        System.out.println(nums);


    }
}
