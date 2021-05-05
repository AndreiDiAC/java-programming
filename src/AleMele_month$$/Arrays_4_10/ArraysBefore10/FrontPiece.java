package AleMele_month$$.Arrays_4_10.ArraysBefore10;
/**
 Given an int array num of any length, print a new array of its first 2 elements.
 If the array is smaller than length 2, use whatever elements are present.

 Examples:

 input: 1, 2, 3

 output: [1, 2]
 input: 1, 2, 3

 output: [1, 2]
 input: 1

 output: [1]
 input: 1

 output: [1]
 input: 4, 5, 4, 3, 8

 output: [4, 5]
 */
import java.util.Arrays;
import java.util.Scanner;

public class FrontPiece {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] num = new int[size];
        for(int i = 0; i < size; i++){
            num[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(num));





        if(num.length >= 2){
            int[] num2 = new int[2];
            num2[0] = num[0];
            num2[1] = num[1];
            System.out.println(Arrays.toString(num2));
        }else if(num.length == 1){
            int[] num1 = new int[1];
            num1[0] = num[0];
            System.out.println(Arrays.toString(num1));
        }
    }
}
