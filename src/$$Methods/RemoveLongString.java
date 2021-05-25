package $$Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {
    public static void main(String[] args) {
        System.out.println(removeLongString(new ArrayList<>(Arrays.asList("one", "two", "three","four","five","six")),4));
    }


    public static ArrayList<String> removeLongString(ArrayList<String> list, int number){
        ArrayList<String> newList = new ArrayList<>();
        for(String each: list){
            if(each.length() >= number){
                newList.add(each);
            }
        }
        return newList;
    }
}
