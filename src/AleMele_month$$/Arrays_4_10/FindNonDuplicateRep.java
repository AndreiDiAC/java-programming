package AleMele_month$$.Arrays_4_10;
import java.util.Scanner;
/**
 Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.

 Example:

 nums -> [1, 1, 2, 3, 4, 3, 4] -> 2
 */
public class FindNonDuplicateRep {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length array:");
        int size = s.nextInt();
        System.out.println("Enter array:");
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = s.nextInt();
        }
//        int[] nums = {1, 1, 2, 3, 3, 4};


        for( int i = 0; i < nums.length; i++){
            int count = 0;
            for( int j = 0; j < nums.length;j++){
                if(i!=j){
                    if(nums[i] == nums[j]){
                        count++;
                    }
                }
            }
            if(count == 0){
                System.out.println(nums[i]);
            }
        }








    }
}
