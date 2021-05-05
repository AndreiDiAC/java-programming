package AleMele_month$$.Loops;

import java.util.Scanner;

/**
 Given two strings, word and a separator sep, return a big string made of
 count occurrences of the word, separated by the separator string.

 Example:

 input:
 Word
 X
 3

 output: WordXWordXWord
 input:
 Word
 X
 3

 output: WordXWordXWord
 Example:

 input:
 This
 And
 2

 output: ThisAndThis
 input:
 This
 And
 2

 output: ThisAndThis
 Example:

 input:
 This
 And
 1

 output: This
 */
public class RepeatSeparator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter requests:");


        String word = s.next();
        String separator = s.next();
        int count = s.nextInt();
        String strCount = "";

        for ( int i = 0; i < count; i++){
            strCount += "" + word + separator;
        }
        System.out.println(strCount.substring(0, strCount.length()-separator.length()));



















    }
}
