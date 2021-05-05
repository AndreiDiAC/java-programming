package day09_scanner_practice;

import java.util.Scanner;

public class AksAveV1 {
    public static void main(String[] args) {
        System.out.println("How old are ou?");
        int yourAge = 22;
        System.out.println(yourAge);
        System.out.println(yourAge + " - that is a great age!");
        System.out.println();


        Scanner a = new Scanner(System.in);
        System.out.println("How old are you?");
        String age = a.next();
        System.out.println(age + " - that is a great age!");

    }
}
