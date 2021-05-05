package OfficeHours.Practice_05_03;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfNumbersInList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123" , "54", "24"));

        int [] numSum = new int[list.size()];
        int j = 0;
        for( String each : list){
            int sum = 0;
            for ( int i = 0; i < each.length(); i++){
                sum += Integer.parseInt("" + each.charAt(i));
            }

            numSum[j] = sum;
            j++;

        }

        System.out.println(Arrays.toString(numSum));


    }
}
