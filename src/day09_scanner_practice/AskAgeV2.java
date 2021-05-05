package day09_scanner_practice;
import java.util.Scanner;

public class AskAgeV2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("How are you doing?");
        int age = a.nextInt(); // int age = 11;
        System.out.println(age + " - that is a great age!");
        // a.close(); optionaly close the scanner
    }
}
