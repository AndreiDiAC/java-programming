package $$interviewTasks;


import java.util.ArrayList;
import java.util.Arrays;

public class b {
    public static void main(String[] args) {
        SortLettersAndNumbersFromString("DC501GCCCA098911");
        sort2("DC501GCCCA098911");


        int [] arr = new int[10];
    }

//    Input:  "DC501GCCCA098911"
//
//      OutPut: "CD015ACCCG011899"

    public static void sort2(String str){
        ArrayList<String> arr = new ArrayList<>();
        String letters = "";
        String digit = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){
                letters += str.charAt(i);
                if(i < str.length()-1 && Character.isDigit(str.charAt(i+1))){
                    String [] sort = letters.split("");
                    Arrays.sort(sort);
                    letters = String.join("",sort);
                    arr.add(letters);
                    letters ="";
                }

            }else if(Character.isDigit(str.charAt(i))) {
                digit += str.charAt(i);
                if (i < str.length()-1 && Character.isLetter(str.charAt(i + 1)) ) {
                    String[] sort2 = digit.split("");
                    Arrays.sort(sort2);
                    digit = String.join("", sort2);
                    arr.add(digit);
                    digit = "";
                }
            }
        }
        if(!letters.isEmpty() || !digit.isEmpty()){
            String [] sort = letters.split("");
            Arrays.sort(sort);
            letters = String.join("",sort);
            arr.add(letters);

            String[] sort2 = digit.split("");
            Arrays.sort(sort2);
            digit = String.join("", sort2);
            arr.add(digit);

        }

        String result = String.join("",arr);
        System.out.println(result);
    }



    public static void SortLettersAndNumbersFromString(String str) {

        String str2 = "";

        for(int i = 0; i < str.length(); i++) {

            str2 += ""+str.charAt(i);

            if(Character.isAlphabetic(str.charAt(i)) && i < str.length()-1 ) {

                if(Character.isDigit(str.charAt(i+1)) ) {

                    str2 +=",";

                }

            }



            if(Character.isDigit(str.charAt(i)) && i < str.length()-1) {

                if(Character.isAlphabetic(str.charAt(i+1))) {

                    str2 +=",";

                }

            }

        }

        String[] arr = str2.split(",");

        str ="";

        for(String each: arr) {

            char[] chars=each.toCharArray();

            Arrays.sort(chars);

            for(char eachChar: chars){

                str +=""+eachChar;

            }

        }

        System.out.println(str);

    }


    public static void sort(String str){
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            str2 += str.charAt(i);

            if(Character.isLetter(str.charAt(i)) && i < str.length()-1){
                if(Character.isDigit(str.charAt(i + 1))){
                    str2 += ",";
                }
            }

            if(Character.isDigit(str.charAt(i)) && i < str.length()-1){
                if(Character.isLetter(str.charAt(i + 1))){
                    str2 += ",";
                }
            }
        }

        String [] arr = str2.split(",");
        String result ="";
        for(String each: arr){
            char [] charArr = each.toCharArray();
            Arrays.sort(charArr);
            for(char ch: charArr){
                result += ch + "";
            }
        }

        System.out.println(result);
    }





}
