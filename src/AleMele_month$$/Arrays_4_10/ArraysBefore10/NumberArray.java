package AleMele_month$$.Arrays_4_10.ArraysBefore10;

/**
 100numberarray
 1.Create an int array called numbers that has length of 100
 2.Assign 1-100 to each index of the array.Then use a for each loop to print out all the elements of the array
 */
public class NumberArray {
    public static void main(String[] args) {
        int[] nums = new int[100];

        for( int i = 0; i < nums.length; i++){
            nums[i] = i+1;  // num[index] = value
        }

        for(int each: nums){
            System.out.print(each + " ");
        }


    }
}
