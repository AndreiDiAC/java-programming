package $$Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class nanuk {

    public static boolean nanuk(ArrayList<String> r, int way_stones, int boast){
        boolean result  = false;
        int count =0;
        int points = 0;

        for( String each : r){

            if(each.equals("nanuk")) {
                count++;

            }else{
                points += Integer.parseInt(each);
            }
        }

        if(count <= way_stones && points >= boast){
            result = true;
        }

        return result;
    }


    public static void main(String[] args) {

        System.out.println(nanuk(new ArrayList<>(Arrays.asList("nanuk","2","3","5")), 1, 5));
    }
}
