package AleMele_month$$$.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CopyCertainValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String [] arr = {s.next(),s.next(),s.next(),s.next(),s.next(),};
//        System.out.println(Arrays.toString(getWithE(new String[] {"zero","one","two","three","four"})));
    }

    public static String[] getWithE(String [] arr){
        int count = 0;
        for(String each: arr){
            if(each.contains("e")){
                count++;
            }
        }
        String[] fewValues = new String[count];
        for(int i = 0,f = 0; i < arr.length;i++){
            if(arr[i].contains("e")){
                fewValues[f++] = arr[i];
            }
        }
        return fewValues;


    }
}
