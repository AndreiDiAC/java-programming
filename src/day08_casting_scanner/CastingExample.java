package day08_casting_scanner;

import java.util.Arrays;

public class CastingExample {
    public static void main(String[] args) {
        byte num1 = 100;
        short num2 = num1;

        int num3 = num1;
        int num4 = 1000;
        long num5 = num4;
        float num6 = 124.4f;
        double num7 = num6;

        int num8 =3456;
        double num9 = num8;
        System.out.println("num9 = " + num9);//3456.0
        
        int num10 = 22;
        byte num11 = (byte) num10; // cast/convert to smaller
        System.out.println("num11 = " + num11);
        short num12 =(short) num10;
        System.out.println("num12 = " + num12);

        double num15 =1234.5;
        int num16 =(int) num15;
        System.out.println("num16 = " + num16);
        
        int a = 300;
        byte b =(byte) a;
        System.out.println("b = " + b);
        
        char letter = 'a'; //97
        int numLetter = letter;
        System.out.println("numLetter = " + numLetter);
        
        
        
    }
}
