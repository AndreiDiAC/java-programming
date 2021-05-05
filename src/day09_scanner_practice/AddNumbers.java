package day09_scanner_practice;
import java.util.Scanner; //import scanner class

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //create scanner object
        System.out.println("Enter 2 numbers");  //ask question
        int num1= scan.nextInt();//
        int num2 = scan.nextInt();
        System.out.println("Result: " + (num1 + num2));

    }
}
