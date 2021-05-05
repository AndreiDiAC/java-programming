package day14_multi_branch_if_statements;

public class Calculator {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 4;
        char operators = '/';
        if (operators == '-'){
            System.out.println("minus -> " + (num1-num2));
        }else if(operators == '+'){
            System.out.println("add -> "+(num1 + num2));
        }else if(operators == '*'){
            System.out.println("multiply -> "+ (num1 * num2));
        }else if(operators =='/'){
            System.out.println("division -> " + (num1 / num2));
        }else{
            System.out.println("Invalid Operator");
        }

    }
}
