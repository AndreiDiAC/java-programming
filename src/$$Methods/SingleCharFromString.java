package $$Methods;

import java.util.Arrays;
import java.util.Scanner;

public class SingleCharFromString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }

    public static String uniqueChars(String str) {
        String single = "";
        for (int i = 0; i < str.length(); i++) {
            if(!single.contains("" + str.charAt(i))){
                single+= str.charAt(i);
            }
        }
        return single;



    }


}
