package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeMethods {
    public static void main(String[] args) {
        a(Arrays.asList(1,2,3,4));
        List<Integer> nums = method();

    }

    public static void a(List<Integer> num){
        System.out.println(num);
    }

    public static List<Integer> method(){
        List<Integer> nums = new ArrayList<>();
        nums.add(12); nums.add(2); nums.add(1);
        return nums;
    }


}
