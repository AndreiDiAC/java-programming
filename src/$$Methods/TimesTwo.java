package $$Methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TimesTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        ArrayList<Integer> list =new ArrayList<>();
        for( int i = 0; i < size;i++){
            list.add(s.nextInt());
        }
        System.out.println(timesTwo(list));
    }

    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){
        ArrayList<Integer> nums2 = new ArrayList<>();
        for( int each : nums){
            nums2.add(each * 2);
        }
        return nums2;
    }
}
