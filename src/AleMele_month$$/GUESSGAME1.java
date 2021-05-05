package AleMele_month$$;

import java.util.Random;
import java.util.Scanner;

public class GUESSGAME1 {
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
            }
            variable++;
        }
        if (variable >= 3) {
            System.out.println("You tried 3 times. Came back later! ");
        } else if (secretNumber == guessingNumber) {
            System.out.println("GOOD JOB! YOU FIND THE NUMBER!");

        }

    }

}

