package AleMele_month$$.Arrays_4_10;

import java.util.Arrays;

/**
 Given a String array words, iterate through each word and print first and last letter of each element in the format below.
 Put each first and last letter in an array.

 Example:

 words → ["hello", "why", "by", "apple" , "note"]

 print → [ho, wy, by, ae, ne]
 */
public class PrintFirstAndLastChar {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int size = s.nextInt();
//        String[] words = new String[size];
//        for (int i = 0; i < words.length; i++){
//            words[i] = s.nextLine();
//        }
        String[] words = {"hello", "why", "by", "apple" , "note"};
        String firstLast = "";

        for (String each: words){
            firstLast += "" + each.charAt(0)  + each.charAt(each.length()-1)+ " " ;
        }
        System.out.println(Arrays.toString(firstLast.split(" ")));
    }
}
