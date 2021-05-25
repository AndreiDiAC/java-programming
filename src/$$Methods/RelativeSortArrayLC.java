package $$Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class RelativeSortArrayLC {
    public static void main(String[] args) {
        //Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
        //Output: [2,2,2,1,4,3,3,9,6,7,19]
        System.out.println(relativeSortArray(new ArrayList<>(Arrays.asList(2,3,1,3,2,4,6,7,9,2,19)),
                new ArrayList<>(Arrays.asList(2,1,4,3,9,6))));


    }

    public static ArrayList<Integer> relativeSortArray(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        ArrayList<Integer> copy = new ArrayList<>();
        copy.addAll(arr1);
        ArrayList<Integer> result = new ArrayList<>();


        for( Integer num2 : arr2){
            for(Integer num1 : arr1){
                if(num2 == num1){
                    result.add(num1);
                    copy.remove(num1);
                }
            }
        }
        result.addAll(copy);
        return result;
    }

}



