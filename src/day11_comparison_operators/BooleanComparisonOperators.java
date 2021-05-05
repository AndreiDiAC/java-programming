package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(1 == 1);
        System.out.println(1 < 2);
        System.out.println(2 > 1);
        System.out.println(2 >= 2);
        System.out.println(2 <= 3);
        System.out.println(2 != 3);

        int a = 100;
        int b = 200;
        System.out.println(a==b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a != b);
        
        boolean result;
        result = 5 == 5;
        System.out.println("result = " + result);

        result = 33 > 34;
        System.out.println("result = " + result);

        result = 88 < 99;
        System.out.println("result = " + result);

        result = 10 >= 10;
        System.out.println("result = " + result);

        result = 123 <= 124;
        System.out.println("result = " + result);

        result = 2 != 2;
        System.out.println("result = " + result);

        String city = "Seattle";
        System.out.println(city == "Seattle");
        System.out.println(city ==  "Baku");

        String name = "Andrei";
        boolean checkName = name == "Andrei";
        System.out.println(checkName);



        
    }
}
