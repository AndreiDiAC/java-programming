package day09_scanner_practice;
import java.util.Scanner;
public class CentsToDollars {
    public static void main(String[] args) {
        //int cent = 844; hard code
        Scanner scan = new Scanner(System.in);
        System.out.println("Your Number:");
        int cents = scan.nextInt();
        int dollar = cents / 100;
        int remainder = cents % 100;
        System.out.println(cents + " = "+ dollar + "$ " + remainder + "cents");

    }
}
