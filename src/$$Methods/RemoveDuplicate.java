package $$Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        System.out.println(removeDuplicate(new ArrayList<>(Arrays.asList(1,3,5,1,4,5,9))));
    }



    public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<>();

        for(Integer each : list){
            int count = 0;
            for(Integer num : list){
                if(num == each){
                    count++;
                }
            }
            if(count == 1){
                newList.add(each);
            }
        }
        return newList;
    }
}
