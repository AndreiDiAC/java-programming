package day12_conditional_statements;
import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total price:");
        int totalPrice = scan.nextInt();
        if (totalPrice >= 25){
            System.out.println("Free shipping eligible. Your order total: $55");
        }else {
            System.out.println("Not Eligible for free shipping. Your order total is less then $25");
        }
        System.out.println("Thank you for shopping amazon!");
    }
}
