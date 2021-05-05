package day13_conditional_statements2;
import java.util.Scanner;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("**** WELCOME TO ATM ****\nEnter your pin:");
        int secretCode = 1234;
        int inputCode = s.nextInt();
        if (inputCode ==secretCode){
            System.out.println("You can:\nWithdraw\nCheck balance\nDeposit");
        }else{
            System.out.println("Incorrect code!\nPlease try again!");
        }
    }
}
