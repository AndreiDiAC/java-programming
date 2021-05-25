package $$Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseALl {
    public static void main(String[] args) {
        System.out.println(reverseAll(new ArrayList<>(Arrays.asList("ted","talk","learn"))));
    }

    public static ArrayList<String> reverseAll(ArrayList<String> list){
        ArrayList<String> output = new ArrayList<>();
        for(String each: list){
            String reverse = "";
            for( int i = each.length()-1; i >=0 ;i--){
                reverse += each.charAt(i) ;
            }
            output.add(reverse);
        }
        return output;
    }
}
