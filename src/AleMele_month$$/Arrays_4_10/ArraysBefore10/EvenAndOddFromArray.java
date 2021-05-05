package AleMele_month$$.Arrays_4_10.ArraysBefore10;
/**
 Even and odd from array
 Write a program that can count the even and odd number from an array of integers
 Use for each to make it easier
 Ex:Input:  [4,1,3,12,5]
 Output:    Even:2
            Odd: 3
 */

import java.util.Scanner;

public class EvenAndOddFromArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = s.nextInt();
        System.out.println("Enter arrays nums:");
        int[] nums = new int[size];
        for( int i = 0; i < size;i++) {
            nums[i] = s.nextInt();
        }

        int even =0;
        int odd = 0;

        for(int each : nums){
            if(each %2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
