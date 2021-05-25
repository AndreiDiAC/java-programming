package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodWithListReturn {
    public static void main(String[] args) {
        //nano time
        System.out.println(System.nanoTime());
        long start = System.nanoTime();
        System.out.println(getIntegerList());
        long end = System.nanoTime();
        System.out.println("ArrayList time = " + (end - start));



    }

    public static List<Integer> getIntegerList(){
        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i <=  1000_000; i++){
            nums.add(i);
        }
        return nums;
    }

    public static int [] getIntegerArray(){
        int[] nums = new int[1000_001];
        for( int i = 0; i < nums.length; i++){
            nums[i] = i;
        }
        return nums;

    }
}
