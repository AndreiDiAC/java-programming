package day07_arithmetic_operators_casting;

public class DivisionProblem {
    public static void main(String[] args) {
        int num1 = 40;
        int num2 = 15;
        System.out.println(num1 /num2);//2

        double d1 = 12;
        double d2 = 5;
        System.out.println(d1/ d2);//2.4

        int count = 100;
        double dCount = 30.0;
        System.out.println(count/dCount);

        int n1 = 4;
        byte b1 =(byte) n1;
        System.out.println( b1);

        byte b2 = 55;
        int n2 = b2;
    }
}
