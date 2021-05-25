package OfficeHours.Practice_05_11;

import java.util.ArrayList;
import java.util.Arrays;

public class NanukSaim {

    public static void main(String[] args) {
        System.out.println(nanuk(new ArrayList<String>(Arrays.asList("1","nanuk","nanuk","nanuk","nanuk")),3,7));
    }

    public static boolean nanuk(ArrayList<String> r, int way_stones, int boast) {

        int foodFound = 0;

        for(String each : r){

            if(each.equals("nanuk")){
                way_stones--;
            } else {
                foodFound += Integer.parseInt(each);
            }

        }

        return way_stones >= 0 && foodFound >= boast;

    }
    //return home without to be catched by the nanuck
    //we need stones to avoid the nanuk
}
