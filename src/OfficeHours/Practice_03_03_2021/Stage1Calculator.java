package OfficeHours.Practice_03_03_2021;
/*
Make a class Stage1Calculator
create a main method

    - Declare two double variables
    - Declare 5 more double variables for each operation.
        > Execute all the operation between the first two numbers
    - Print out operations
        Ex: if the nums are 5 and 10
            5 + 10 = 15
            5 - 10 = -5
            etc..
 */
public class Stage1Calculator {
    public static void main(String[] args) {
        double num1 = 5.0;
        double num2 = 10.0;

        double addition =num1 + num2;
        double substraction = num1 - num2;
        double multiplicationn = num1 * num2;
        double division = num1/num2;
        double remainder= num1 % num2;

        System.out.println("Calculation for " + num1 + " & " + num2);
        System.out.println(num1 + " + " + num2 + " = " + addition);
        System.out.println(num1 + " - " + num2 + " = " + substraction);
        System.out.println(num1 + " * " + num2 + " = " + multiplicationn);
        System.out.println(num1 + " / " + num2 + " = " + division);
        System.out.println(num1 + " % " + num2 + " = " + remainder);
//print witout variable
        System.out.println("Calculation for " + num1 + " & " + num2);
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));



    }

}
