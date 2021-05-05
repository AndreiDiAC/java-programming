package day37_methods_overloading;

import java.util.Arrays;

public class OverloadMain {
    public static void main(String[] args) {
        System.out.println("Hello From real main method");
        main(10);
        System.out.println(Arrays.toString(args)); //  right top -->  OverloadMain/Edit configuration
    }

    /**
     * overloading main method:
     * sam name + different parameter
     * JDK does not look for this one to run
     */


    public static void main(int num){
        System.out.println("num = " + num);
    }
}
