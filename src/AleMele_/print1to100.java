package AleMele_;


import java.util.*;

public class print1to100 {
    public static void main(String[] args) {
        printIt(1);
    }

    private static void printIt(int n) { //recursion
        System.out.println(n);

        if (n < 100)
            printIt(n + 1);
    }





}
