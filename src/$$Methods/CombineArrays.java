package $$Methods;

import java.util.ArrayList;

public class CombineArrays {
    public static void main(String[] args) {
        System.out.println(combineRs(new String[]{"f","o","o"}, new String[] {"b","a","r"}));
    }

    public static ArrayList<String> combineRs(String [] r1, String [] r2){
        ArrayList<String> output = new ArrayList<>();

        for (String each: r1){
            output.add(each);
        }

        for ( int i = 0, a = r1.length; i < r2.length; i++, a++ ){
            output.add(a, r2[i]);
        }
        return output;
    }
}
