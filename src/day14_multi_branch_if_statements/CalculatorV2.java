package day14_multi_branch_if_statements;
import java.util.Scanner;
public class CalculatorV2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your numbers:");
        double num1 = s.nextDouble();
        double num2 =s.nextDouble();
        System.out.println("Enter your operator:");
        char operator = s.next().charAt(0);
        if (operator == '-'){
            System.out.println("minus result -> " + (num1-num2));
        }else if(operator == '+'){
            System.out.println("add result -> "+(num1 + num2));
        }else if(operator == '*'){
            System.out.println("multiply result -> "+ (num1 * num2));
        }else if(operator =='/'){
            System.out.println("division result -> " + (num1 / num2));
        }else{
            System.out.println("Invalid Operator");
        }
    }
}
