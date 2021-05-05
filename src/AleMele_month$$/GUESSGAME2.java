package AleMele_month$$;

import java.util.Random;
import java.util.Scanner;

public class GUESSGAME2 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);

        int secretNumber = r.nextInt(101);
        System.out.println("Secret number: = " + secretNumber);
        int guessingNumber = 0;
        int variable = 0;


        while (secretNumber != guessingNumber && variable < 3) {
            System.out.println("Enter number:");
            guessingNumber = s.nextInt();
            if (guessingNumber > secretNumber) {
                System.out.println("Wrong your number is too large!");
            } else if (guessingNumber < secretNumber) {
                System.out.println("Wrong, your number is too small!");
            } else {
                System.out.println("GOOD JOB! YOU FIND THE NUMBER!");
                return;
            }
            variable++;
        }

        System.out.println("You tried 3 times. Came back later! ");


    }

}

