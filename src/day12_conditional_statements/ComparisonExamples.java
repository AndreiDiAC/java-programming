package day12_conditional_statements;
import java.util.Scanner;

public class ComparisonExamples {
    public static void main(String[] args){
//        int currentSpeed, speedLimit;
//        boolean isSpeeding;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter speed:");
//        currentSpeed = scan.nextInt();
//        speedLimit = 55;
//        isSpeeding = currentSpeed > speedLimit;
//        System.out.println("Is Speeding: " + isSpeeding);

        int speedLimit = 5_5;
        int currentSpeed = 4_5;
        System.out.println(currentSpeed > speedLimit); //false
        System.out.println(speedLimit < currentSpeed); //false
        System.out.println(speedLimit == currentSpeed); //false

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("currentSpeed = " + currentSpeed + "MPH");
        System.out.println("speedLimit = " + speedLimit + "MPH");
        System.out.println("Are you seeding? - " + isSpeeding);

        currentSpeed += 20;
        isSpeeding = currentSpeed > speedLimit;
        System.out.println("currentSpeed = " + currentSpeed + "MPH");
        System.out.println("speedLimit = " + speedLimit + "MPH");
        System.out.println("Are you seeding? - " + isSpeeding);

        double accountBalance = 250.25;
        double itemPrice = 100;
       // boolean canAffordIt = item <= accountBalance;
       // System.out.println("Can I afford it? - " + canAffordIt);
        System.out.println("Can I afford it? - " + (accountBalance >= itemPrice));

        //decrease balance by itemPrice. using shorthand operator
        accountBalance -= itemPrice;
        boolean isBroke = accountBalance <= 0;
        System.out.println("Am I broke? - "+ isBroke);



    }
}
