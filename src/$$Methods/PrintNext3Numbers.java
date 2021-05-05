package $$Methods;
import java.util.Scanner;
public class PrintNext3Numbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter number");
        int num = inp.nextInt();
        System.out.println("next 3 are:");
        next3(num);
    }

    public static void next3(int num){
        System.out.println((num +1) + " " + (num + 2) +" " + (num +3));
    }
}
