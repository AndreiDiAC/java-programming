package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("java","html","selenium","a","input","title"));

        printStrList(words);

        printStrList(new ArrayList<>(Arrays.asList("select","option","br","python","sql")));

        System.out.println("Sum numbers = " + sumIntegersList(new ArrayList<>(Arrays.asList(1,2,3,4,5))));

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,3,4));
        System.out.println(sumIntegersList(nums));


    }
    /**
     methodName: printStrList
     param: List of Strings
     return: void
     print all values separated by space in same line
     */



    public static void printStrList(List<String> strings){
        for(String each: strings){
            System.out.print(each + " ");
        }
        System.out.println();
    }


    /**
     method: sumIntegerList
     param: List of integer
     return int
     calculates sum of integers in the list then returns
     */
    public static int sumIntegersList(ArrayList<Integer> integers){
        int sum = 0;
        for( int each : integers){
            sum += each;
        }
        return sum;
    }
}
