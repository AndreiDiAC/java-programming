package day09_scanner_practice;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hourly rate:");
        double num = scan.nextDouble();
        double weeklyPay = num * 40;
        double monthlyPay = weeklyPay * 52/ 12;
        double annualPay = monthlyPay * 12;
        double tax = annualPay * 0.30;
        System.out.println("Hour pay: " + num );
        System.out.println("Weekly Pay: " + weeklyPay);
        System.out.println("Monthly Pay: " + monthlyPay);
        System.out.println("Annual Pay: " + annualPay);
        System.out.println("Anual Pay After tax: " + (annualPay - tax));
    }
}
