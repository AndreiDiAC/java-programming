package AleMele_;
import java.util.Scanner;
/*
[Triangle - If statement, operators]

A triangle is valid if the sum of all the three angles is equal to 180 degrees.
Write a program that declares three integers as angles and check whether the triangle is valid or not.
Print "Valid triangle" or "Not a valid triangle".

    => To make it dynamic change the three angles to be Scanner inputs
 */
public class Triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 3 angles:");
        double angle1 = s.nextDouble();
        double angle2 = s.nextDouble();
        double angle3 = s.nextDouble();
        if (angle1 + angle2 + angle3 == 180){
            System.out.println("Valid triangle");
        }else{
            System.out.println("Not a valid triangle");
        }
    }
}
