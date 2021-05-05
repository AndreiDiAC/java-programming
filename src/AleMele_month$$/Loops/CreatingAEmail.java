package AleMele_month$$.Loops;

import java.util.Scanner;

/**
 [Creating an email]
 Ask user to enter two strings. Both of these strings should be at least 6 character long. If they
 are shorter than that print “Invalid data” and program should end.
 If the information provided is valid, you will take the first 4 characters of first string and
 combine them with the last three characters of the second string. At the end of your combined
 string add “@cybertek.com” and print the final string as your created email. The final email
 should be in all lowercase.
 input:
 JamesBond
 Secret
 output:
 jameret@cybertek.com

 */
public class CreatingAEmail {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 2 strings:");
        String str1 = s.next();
        String str2 = s.next();
        String a ="asd";
        if(str1.length() >= 6 && str2.length() >= 6) {
            str1 = str1.toLowerCase().substring(0,4);
            str2 = str2.toLowerCase().substring(0,3);
            System.out.println(str1 + str2 + "@cybertek.com");
        }else{
            System.out.println("Invalid data");
        }

    }
}
