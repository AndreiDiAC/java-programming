package day31_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] letters = {'j','a','v','a',' ','i','s',' ','f','u','n'};
        for( char each: letters){
            System.out.print(each);
        }

        //CONVERT CHAR ARRAY INTO TO STRING:
        String sentence = new String(letters);
        System.out.println("\n" + sentence);


        //CONVERT STRING INTO ARRAY
        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.lenth() = " + item.length());


        //FOR EACH LOOP OR ENHANCED FOR LOOP
        String[] fruits = {"bananas","apples","kiwi","mango","papaya","strawberry"};
        String fruitStr = "";
        for(String each: fruits){
            fruitStr += each + "-";
        }
        System.out.println(fruitStr.substring(0,fruitStr.length()-1));

        //String Array into String with join
        String[] languages = {"java", "python","c++","ruby","javascript" };
        System.out.println(String.join("|",languages));
        String joinedLanguages = String.join("   ",languages);
        System.out.println(joinedLanguages);


    }
}
