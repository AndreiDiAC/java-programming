package day36_methodes_with_return;

public class Calculations {
    public static void main(String[] args) {
        System.out.println("add 10+45 = " + Calculator.add(10,45));
        System.out.println("55 - 4 +" + Calculator.add(55,4));

        double d1 =234.3;
        double d2 = 321.5;
        double result = Calculator.add(d1,d2);
        System.out.println("result = " + result);
        System.out.println();


    }
}
