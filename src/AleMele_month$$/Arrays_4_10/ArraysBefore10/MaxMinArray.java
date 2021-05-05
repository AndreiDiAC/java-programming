package AleMele_month$$.Arrays_4_10.ArraysBefore10;

/**
 Max and Min number from Array
 •Write a program that can find the maximum number from any given int array
 •Write a program that can find the minimum number from any given int array
 */
public class MaxMinArray {
    public static void main(String[] args) {
        int[] numbers = {1,4,2,5,6,8,12,5,0};
        int max = 0;
        for(int each: numbers){
            if(each > max){
                max = each;
            }
        }
        System.out.println(max);


        int min = numbers[0];
        for(int each: numbers){
            if(each < min){
                min = each;
            }
        }
        System.out.println(min);
    }
}
