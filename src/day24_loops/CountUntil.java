package day24_loops;

import java.util.*;

public class CountUntil {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number to cont until:");
        int numberToEnd = s.nextInt();
        int start = 1;
        while(start <= numberToEnd){
            System.out.print(start + " ");
            start++;
        }
    }
}
