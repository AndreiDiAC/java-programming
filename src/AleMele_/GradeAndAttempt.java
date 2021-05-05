package AleMele_;
import java.util.Scanner;
/*
[If statements, operators]

Write a program that will give the grade after the retake.
The program should read a score of the test and which attempt it was.

    If its the first attempt -> subtract 10%
    If its the second attempt -> subtract 20%
    If its the third attempt -> subtract 35%
 */
public class GradeAndAttempt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the grade:");
        double grade = s.nextDouble();
        System.out.println("Enter the attempt");
        byte attempt = s.nextByte();
        if (attempt == 1){
            grade *= 0.9;
        }
        if (attempt == 2){
            grade *= 0.8;
        }
        if (attempt==3){
            grade *= 0.65;
        }
        System.out.println("It is your " + attempt + " attempt.\nYour grade is " +  grade);
    }
}
