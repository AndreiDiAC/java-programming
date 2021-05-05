package AleMele_month$$.Loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        String reverse = "";

        for ( int i = word.length()-1; i  >=  0; i--){
            reverse += "" + word.charAt(i);
            System.out.println(word.charAt(i));
        }
        System.out.println(word.equals(reverse));
    }
}
