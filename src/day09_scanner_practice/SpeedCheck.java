package day09_scanner_practice;
import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        int speedL = 55;
        int currentS = 70;
        int overTheL = currentS - speedL;
        System.out.println("You are driving " + overTheL + "MPH over the limit.");



        Scanner scan =  new Scanner(System.in);
        System.out.println("What is your current speed?");
        int currentSpeed = scan.nextInt();
        System.out.println("What is the speed limid?");
        int speedLimit = scan.nextInt();
        int overTheLimit =  currentSpeed - speedLimit;
        System.out.println("Your are driving " + overTheLimit + "MPH over the limnit.");

    }
}

