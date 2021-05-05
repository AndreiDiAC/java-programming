package AleMele_month$$.Loops;

import java.util.Scanner;

/**
 * • Write a program that will ask ‘upper’ or ‘lower’
 * • If it is upper: print the alphabet in all uppercase letter from A to Z
 * • If it is lower: print the alphabet in all uppercase letter from a to z
 * - Challenge: Also ask if they want to show the alphabet in ascending or
 * order descending
 * - Ascending: A – Z or a – z
 * - Descending: Z – A or z – a
 */
public class DynamicAlphabet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Upper OR Lower?");
        String answer = s.next().toLowerCase();
        if(answer.equals("upper".toLowerCase())){
            System.out.println("Ascending OR Descending?");
            String answer2 = s.next().toLowerCase();
            if(answer2.equals("ascending")){
                for (char a = 'A'; a <= 'Z'; a++) {
                    System.out.print(a + " ");
                }
            }else if(answer2.equals("descending")){
                for (char a = 'Z'; a >= 'A'; a--) {
                    System.out.print(a + " ");
                }
            }else{
                System.out.println("Invalid answer!");
            }

        }else if(answer.equals("lower")){
            System.out.println("Ascending OR Descending?");
            String answer2 = s.next().toLowerCase();
            if(answer2.equals("ascending")){
                for(char a = 'a'; a <='z';a++) {
                    System.out.print(a + " ");
                }
            }else if(answer2.equals("descending")) {
                for (char a = 'z'; a >= 'a'; a--) {
                    System.out.print(a + " ");
                }
            }else{
                System.out.println("Invalid answer!");
            }
        }else{
            System.out.println("Invalid answer");
        }
    }
}
