package day36_methodes_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(5.2,20.0));
        double sum = add(1,3);
        System.out.println("sum = " + sum);
        System.out.println("100.0 + 200.0 = "+ add(100,200));


    }

    public static double add(double num1, double num2){
        return num1 + num2;
    }

    public static double substriction(double num1, double num2){
        double sub = num1 - num2;
        return sub;
    }


    public static double multiple(double num1, double num2){
        return num1 * num2;
    }

}
