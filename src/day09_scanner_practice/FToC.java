package day09_scanner_practice;
import java.util.Scanner;

public class FToC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your Fahrenheit:");
        double f = scan.nextDouble();
        double celsius = (f-32)*5/9;
        System.out.println(f + "F" + " = "+ celsius + "C");
    }
}
