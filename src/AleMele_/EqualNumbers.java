package AleMele_;

import java.util.Scanner;

/*

Write a program that will ask the user to enter three numbers.
If the numbers are the same print “All integers are the same”
If they are not equal, print which is the biggest value of the three numbers
—> If there is two numbers which are the largest print the one that came first
> Input: 3,2,6
> Output: The biggest number from 3, 2 and 6 is: 6
 */
public class EqualNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = s.nextInt();
        System.out.println("Enter second number:");
        int num2 = s.nextInt();
        System.out.println("Enter third number:");
        int num3 = s.nextInt();
        if (num1 == num2 && num2 == num3) {
            System.out.println("All integers are the same");
        } else {
            if (num1 > num2 && num1 > num3) {
                System.out.println(num1);
            } else if (num2 > num1 && num2 > num3) {
                System.out.println(num2);
            } else if(num3 > num1 && num3 > num2){
                System.out.println(num3);
            }else{
                if(num1 == num2){
                    System.out.println(num1);
                }else if(num1 == num3){
                    System.out.println(num1);
                }else if(num2 == num3){
                    System.out.println(num2);
                }
            }
        }

    }
}