package AleMele_month$$.Arrays_4_10.ArraysBefore10;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {4,3,2,44,1,100,55};


//        String a = "[";
//        for(int i = nums.length-1; i >= 0; i--){
//            a += nums[i] + ", ";
//
//        }
//        System.out.println(a.substring(0, a.length()-2) + "]");
        int temp = 0;
        for(int i = 0; i < nums.length/2; i++){
            temp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;

        }
        System.out.println(Arrays.toString(nums));



    }
}
