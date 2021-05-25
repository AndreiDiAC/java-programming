package $$Methods;


import java.util.ArrayList;
import java.util.Arrays;

public class GetUppercaseOrLowercase {
    public static void main(String[] args) {
        System.out.println(getUpperLower("SI asa",false));
    }

    public static ArrayList<String> getUpperLower(String str, boolean isUpper) {
        ArrayList<String> list = new ArrayList<>();

        if (isUpper) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isUpperCase(str.charAt(i))) {
                    list.add("" + str.charAt(i));
                }
            }
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLowerCase(str.charAt(i))) {
                    list.add("" + str.charAt(i));
                }

            }
        }
        return list;
    }
}
