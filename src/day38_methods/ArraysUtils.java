package day38_methods;

public class ArraysUtils {


    public static void printArray(int[] nums){
        for (int num: nums){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int sum(int [] nums){
        int sum = 0;
        for (int i: nums){
            sum += i;
        }
        return sum;
    }

    public static boolean contains( int [] nums, int num){
        boolean contains = false;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == num){
                contains =  true;
                break;
            }
        }
        return contains;
    }

}
