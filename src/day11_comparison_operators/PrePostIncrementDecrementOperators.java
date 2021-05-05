package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        //Pre-increment
        int num1 = 10;
     //   ++num1;
     //   int num2 = num1; ----> the sam with above line
        int num2 = ++num1;
        System.out.println("num1 = " + num1); //11
        System.out.println("num2 = " + num2); //11

        //POST - INCREMENT

        int num3 = 8;
//        int num4 = num3;
//        num3++;
        int num4 = num3++;
        System.out.println("num3 = " + num3); //9
        System.out.println("num4 = " + num4); //8

        int apples = 5;
        int basket = ++apples;
        System.out.println("apples = " + apples);
        System.out.println("apples in the basket = " + basket);

        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBasket = " + kiwiBasket);

        int cars = 5;
        System.out.println(++cars); //6

        int sedans = 10;
        System.out.println(sedans++); //10
        System.out.println(sedans);   //11

        int a = 10;
        ++a;
        System.out.println(a);
        
        int b = 10;
        b++;
        System.out.println("b = " + b);

        int as = 50;
        int bs = 22;
        int cs = as++ + ++bs;
        System.out.println("as = " + as);
        System.out.println("bs = " + bs);
        System.out.println("cs = " + cs);



    }
}
