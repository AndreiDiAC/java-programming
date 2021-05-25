package OfficeHours.Practice_05_10;

import java.util.ArrayList;

public class LetterDigitSpecial {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        System.out.println(separateParts(str));
    }

    public static ArrayList<ArrayList<Character>> separateParts(String str) {

        ArrayList<ArrayList<Character>> all = new ArrayList<>(); // [ [letters ], [ digits ], [special]]

        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> special = new ArrayList<>();
        all.add(letters);
        all.add(digits);
        all.add(special);

//        all.add(new ArrayList<>());
//        all.add(new ArrayList<>());
//        all.add(new ArrayList<>());

        for(int i =0; i < str.length(); i++) {

            char eachChar = str.charAt(i);

            if(Character.isLetter(eachChar)){
                all.get(0).add(eachChar);
            } else if(Character.isDigit(eachChar)){
                all.get(1).add(eachChar);
            } else {
                all.get(2).add(eachChar);
            }

        }

        return all;
    }
}
