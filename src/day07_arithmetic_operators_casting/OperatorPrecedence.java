package day07_arithmetic_operators_casting;

public class OperatorPrecedence {
    public static void main(String[] args) {
        System.out.println(10+5-3);//12
        System.out.println(10-5+3);//8
        System.out.println(10- (5+8));//2

        System.out.println(2*3/3);//2
        System.out.println(20/(2*2));//5
        //System.out.println(10/0); nu poti imparti un numar la 0. error in java
        System.out.println(2+5*3);//17
        System.out.println((2+5)*3);//21
        System.out.println(10/3);// 3 - java keep the change
        System.out.println(10.0/3.0);//3.33333


    }
}
