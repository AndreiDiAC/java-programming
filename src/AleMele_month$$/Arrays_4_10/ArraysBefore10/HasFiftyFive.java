package AleMele_month$$.Arrays_4_10.ArraysBefore10;
import java.util.Scanner;
public class HasFiftyFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        boolean bool = false;

        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == 5 && nums[i+1] == 5){
                bool = true;
            }
        }
        System.out.println(bool);

    }
}
