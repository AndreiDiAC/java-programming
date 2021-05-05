package day32_arrays_split;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String words = "java:python:selenium:html";
        String[] wordsArray = words.split(":");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println(wordsArray.length);
        for( String each: wordsArray){
            System.out.println(each);
        }
//----------------------------------------------------------------------------------------------
        String sentence = "today I am coding java arrays";

        System.out.println(Arrays.toString(sentence.split(" ")));
        System.out.println("Number of items in array: " + sentence.split(" ").length);

        //or

        String[] wordInSentance = sentence.split(" ");
        System.out.println(Arrays.toString(wordsArray));

        //print first word
        System.out.println(wordInSentance[0]);
        System.out.println(sentence.split(" ")[0]);

        //print each word from the String
        for( String each: sentence.split(" ")){
            System.out.println(each);
        }

    }
}
