package AleMele_month$$.Loops;

import java.util.Scanner;

public class PrintLetters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter chars:");
        char start = s.next().charAt(0);
        char end = s.next().charAt(0);

        for(start = start;start <= end; start++){
            System.out.print(start);
        }
    }
}
