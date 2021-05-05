package day24_loops;

import java.util.Scanner;

public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pinCode;
        int secretPinCode =1234;
        do{
            System.out.println("Enter pincode:");
            pinCode = s.nextInt();
        }while(pinCode != secretPinCode);
        System.out.println("Entered!");
    }
}
