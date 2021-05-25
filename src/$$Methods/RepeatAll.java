package $$Methods;

import java.util.ArrayList;
import java.util.*;

public class RepeatAll {
    public static void main(String[] args) {
        System.out.println(repeatALl(new ArrayList<>(Arrays.asList(true, false, false))));



    }

    public static ArrayList<Boolean> repeatALl(ArrayList<Boolean> bool){
        ArrayList<Boolean> temp = new ArrayList<>();
            temp.addAll(bool);

        for(int i = 0; i < bool.size(); i++){
            temp.add(bool.get(i));
        }
        return temp;
    }

}
