package day30_arrays;


import java.util.Arrays;
import java.util.Scanner;

public class ForeachLoopArray {
    public static void main(String[] args) {


        //FOR EACH LOOP
        int[] data = {32, 543, 1, 5454, 22, 123, 543, 999, 321, 3};
        for (int eachNum : data){
            System.out.print(eachNum + " ");
        }



        // FOR LOOP WITH ARRAYS
        for ( int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }

        System.out.println(data[data.length-1]);



        // ARRAYS WITH SCANNER
//        System.out.println();
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter nums:");
//        int[] scannerNums = {s.nextInt(),s.nextInt(),s.nextInt()};
//        System.out.println(Arrays.toString(scannerNums));



        for(int i = data.length-1; i >= 0; i--){
            System.out.print(data[i]+ " ");
        }
    }
}
