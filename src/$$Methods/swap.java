package $$Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>(Arrays.asList("one", "two", "three"));
        System.out.println(swap(new ArrayList<>(Arrays.asList("one", "two", "three")),0,2));
    }

    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2){
        String temp = list.get(pos1);
        list.set(pos1,list.get(pos2));
        list.set(pos2, temp);
        return list;
    }
}
