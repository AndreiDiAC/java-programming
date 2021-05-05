package day09_scanner_practice;
import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What did you buy from Target?");
        String a = scan.next();
        String b = scan.next();
        String c = scan.next();
        System.out.println("How much was " + a +", " + b + ", " + c + "?");
        double price1 = scan.nextDouble();
        double price2 = scan.nextDouble();
        double price3 = scan.nextDouble();
        double total = price1 + price2 + price3;
        System.out.println("Total is: $" + total);

    }
}
