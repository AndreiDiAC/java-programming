package OfficeHours.Practice_03_08__2021;

public class CastingPractice {
    public static void main(String[] args) {
        //byte -> short -> int -> long -> float -> double
        byte b = 10;
        short s = b;
        byte b2 = (byte)s;
       // System.out.println(i); //5
        //System.out.println((double)i); //5.0

        double d = 5.3;
        int i = (byte)d;

        float f = 3; //
        float f2 = (float)3.54; // or = 3.54F; daca nu punems F atunci el il poate citi ca si double de asemenea


        long l  = 22312;
        long l2  =  2141253534534534345L; // avem nevoie de L pt ca un numar asa mare poate fi doar long
        //long l3 = (long)427194872614876120; does't work because the number is to big
        long l3 = 427194872614876120l; // atunci il folosim asa
        System.out.println((double)l);
        System.out.println((double)l);

        double million  = 1_000_000;




    }
}
