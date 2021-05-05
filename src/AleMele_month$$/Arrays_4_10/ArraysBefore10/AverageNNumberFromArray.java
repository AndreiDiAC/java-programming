package AleMele_month$$.Arrays_4_10.ArraysBefore10;

import java.util.Scanner;

/**
 Average Number from Array
 Given an int array calculate the average number
 -> Make it flexible so it will work with any array size

 Examples:[1,2,3]-> average: 2
 [10, 15, 5, 6]-> average: 9
 [4, 5, 6, 7, 8, 10, 20, 30, 0]-> average: 10
 */
public class AverageNNumberFromArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter size:");
        int size = s.nextInt();
        System.out.println("Enter your arrays:");
        int[] nums = new int[size];
        for(int i = 0; i < size;i++){
            nums[i] = s.nextInt();
            sum+= nums[i];
        }
        System.out.println(sum/size);








    }
}
