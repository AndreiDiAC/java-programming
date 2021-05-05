package AleMele_;
import java.util.Scanner;

public class VideoGameCoupons {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter numbers of coupons:");
        int num = s.nextInt();
        if (num >= 3){
            int candies = num / 10;
            num %= 10;
            int gumballs = num / 3;
            System.out.println("Number of Candies: " + candies);
            System.out.println("Number of Gumballs: " + gumballs);
        }else{
            System.out.println("Not enough coupons");
        }

    }

}
