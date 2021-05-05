package day37_methods_overloading;

import day29_nestedloop_arrays.ArraysIntro;

public class MethodOverLoading {
    public static void main(String[] args) {
        sum(2,3);
        sum(2,3,4);
        sum("Hello","World");
        MethodOverLoading.sum(1.2,3.2);
        sum((int)4.1,1,2);
        sum(10,4.4);

    }


    public static void sum(int num1, int num2){
        System.out.println("sum(int num1, int num2)");
        System.out.println("Result = " + (num1 + num2));
    }

//    public static void sum(int n1, int n2){
//        System.out.println("sum(int num1, int num2");
//        System.out.println("Result = " + (n1 + n2));
//    }     NO WORKING BECAUSE THE MEATOD SIGNITURE IS THE SAME


    public static void sum(int num1, int num2, int num3){
        System.out.println("sum(int , int)"); //signature
        System.out.println("Result = " + (num1 + num2 + num3));
    }
//             or double instead of void
    public static void sum(double num1, double num2){
        System.out.println("sum(double, double)");
        System.out.println("Result = " + (num1 + num2));
    }

    public static void sum(String str1, String str2){
        System.out.println("sum(string, string)");
        System.out.println("Result = " + (str1 + str2));
    }
}
