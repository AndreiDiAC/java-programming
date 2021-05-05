package AleMele_month$$.Loops;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;

/**
 [Max and Min from 5 numbers]
 • Write a program that can ask the user "enter a number" five times
 and return the maximum number
 • Write a program that can ask the user "enter a number" five times
 and return the minimum number
 */
public class MaxMin5Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = 0;
        int prevNumber = 0;
        int bigger = 0;
        for(int i = 1; i <=5; i++){
            if(prevNumber < number){
                prevNumber = number;
            }
            System.out.println("Enter " + i + "th number:");
            number = s.nextInt();
            if(number > prevNumber){
                bigger = number;
            }

        }
        System.out.println("The biggest number is " + bigger);


    }
}
