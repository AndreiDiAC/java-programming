package day09_scanner_practice;


import java.util.Scanner;

public class Miles2kmConvertor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your mile:");
        double mile = scan.nextDouble();
        double convert = mile *1.60934;
        System.out.println(mile + " mile = " + convert + "km");
    }
}
