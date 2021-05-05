package AleMele_month$$.Arrays_4_10;

import java.util.Arrays;

/**
 * Even and odd Arrays
 * Given an array with values: 1,2,-3,4,-34,55,78,90,33,10
 * - Take our all the even numbers from the array and put them into a
 * new array. Print the new array
 * - Take our all the odd numbers from the array and put them into a new
 * array. Print the new array
 */
public class EvenAndOddArrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, -3, 4, -34, 55, 78, 90, 33, 10};
        int[] evenNum = new int[0];
        String even = "";
        String odd = "";

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even += numbers[i] + ",";
            }
            if(numbers[i] % 2 != 0){
                odd += numbers[i] + ",";
            }
        }
        System.out.println(Arrays.toString(even.split(",")));
        System.out.println(Arrays.toString(odd.split(",")));
    }
}
