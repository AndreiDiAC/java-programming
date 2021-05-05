package $$Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class RecursiveMethod {
    public static void main(String[] args) {
        //immuteble
        String a = "mama";     //a it s save in a spot memory
        a = a.substring(2);   // a it s save in another spot of memory
        System.out.println(a);

//mutableA

        ArrayList<String> b = new ArrayList<>(); //save in a spot of memory
        b.add("tata"); //save in the same spot of memory
        System.out.println(b);

    }

}
