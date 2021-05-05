package day24_loops;

import java.util.*;

public class GuessTheNumberGame {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int secretNumber = 100;
//        int guessingNumber;
//
//        do{
//            System.out.println("Guess the number:");
//            guessingNumber = s.nextInt();
//            if(guessingNumber > secretNumber){
//                System.out.println("Wrong your number is too large!");
//            }else{
//                System.out.println("Wrong, your number is too small!");
//            }
//        }while(guessingNumber !=secretNumber);
//        System.out.println("Congratz!! You got it");
//---------------------------------------------------------------------------------


        Random randomNum = new Random();
        //System.out.println(randomNum.nextInt(101));
        Scanner s = new Scanner(System.in);
        int attempt = 0;

        int secretNumber = randomNum.nextInt(101);
        System.out.println("Random number is " + secretNumber);
        int guessingNumber = 0;
        do{
            System.out.println("Guess the secret number:");
            guessingNumber = s.nextInt();
            if(guessingNumber > secretNumber){
                System.out.println("Wrong your number is too large!");
            }else if(guessingNumber < secretNumber){
                System.out.println("Wrong, your number is too small!");
            }
            attempt++;
        }while(secretNumber != guessingNumber && attempt<3);
        System.out.println("You got it!");




    }
}
