package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFromList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,4,4,1,5,6,0,6));
        List<Integer> uniquesList = getUniqueIntegers(nums);
        System.out.println(uniquesList);





    }

    public static List<Integer> getUniqueIntegers(List<Integer> nums) {
        List<Integer> uniquesList = new ArrayList<>();
        for(int num: nums){
            if(Collections.frequency(nums,num) == 1){
                uniquesList.add(num);
            }
        }
        return uniquesList;
    }
}
