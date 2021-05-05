package AleMele_month$$.Arrays_4_10.ArraysBefore10;
import java.util.Scanner;

/**
 Given a String array words, iterate through each word and print first and last letter of each element in separate lines.

 Example:

 words → ["hello", "why", "by", "apple" , "note"]

 print:
 ho
 wy
 by
 ae
 ne
 */
public class PrintFirstAndLastChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        for(String each: words){
            System.out.println(each.substring(0,1) + each.substring(each.length()-1));
        }

    }
}
