package $$Methods;
/**
 Anagram is a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman.

 The isAnagram method checks if word1 and word2 are anagram to each other then return a boolean.

 each letter in word1 should appear in word2 exact number of times
 ignore empty spaces
 make your code case insensitive
 Examples:

 isAnagram("listen", "Silent") ==> true
 isAnagram("listen", "Silent") ==> true
 isAnagram("earth", "heart") ==> true
 isAnagram("earth", "heart") ==> true
 isAnagram("star", "rats") ==> true
 isAnagram("star", "rats") ==> true
 isAnagram("hi", "bye") ==> false
 copied!
 isAnagram("hi", "bye") ==> false
 isAnagram("java", "cava") ==> false
 */

import java.util.Scanner;
public class Anagram {
    public static boolean isAnagram(String word1, String word2) {

        int count = 0;

        if(word1.length() == word2.length()) {
             for (int i = 0; i < word1.length();i++){
                 if(word2.toLowerCase().contains("" + word1.toLowerCase().charAt(i))){
                     count++;
                 }
             }
        }else
            return false;

        return count == word1.length();






    }

    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));
    }
}
