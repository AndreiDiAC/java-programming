package $$Methods;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        plus();
    }


    public static void plus(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number:");
        int num1 = s.nextInt();
        System.out.println("enter second number:");
        int num2 = s.nextInt();
        int result = num1 + num2;
        System.out.println("result: " + result);
    }
}
