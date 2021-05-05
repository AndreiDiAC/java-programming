package day25_loops;

import java.util.Scanner;

public class StartEnd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter start and end");
//        int i = s.nextInt();
//        int b = s.nextInt();
//
//        for(;i <= b; i++){
//            System.out.println(i);
//        }

        int start = s.nextInt();
        int end = s.nextInt();

        if(start > end){
            System.out.println("reverse numbering is not supported");
        }

        for(int i = start; i<= end; i++){
            System.out.print(i + " ");
        }
    }
}
