package $$Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class AppendPosSum {
    public static void main(String[] args) {
//        System.out.println(appendPosSum(new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3))));

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));
    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums){
        ArrayList<Integer> positive= new ArrayList<>();
        Integer sum = 0;

        for( int each : nums){
            if(each > 0){
                positive.add(each);
                sum += each;
            }
        }

        positive.add(sum);
        return positive;
    }
}
