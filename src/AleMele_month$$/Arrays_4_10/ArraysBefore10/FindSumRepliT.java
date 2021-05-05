package AleMele_month$$.Arrays_4_10.ArraysBefore10;
import java.util.Scanner;
public class FindSumRepliT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int sum = 0;

        for(int each: nums){
            sum += each;
        }
        System.out.println(sum);
    }
}
