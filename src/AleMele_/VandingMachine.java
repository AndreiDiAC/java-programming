package AleMele_;
import java.util.Scanner;
public class VandingMachine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter cents:");
        int cents = s.nextInt();
        if (cents > 0 && cents < 100){
            int quarters = cents / 25;
            cents %= 25;
            int dimes = cents / 10;
            cents %= 10;
            int nickels = cents / 5;
            cents %= 5;
            int pennies = cents / 1;
            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and "
                    + pennies + " pennies" );
        }else{
            System.out.println("Invalid cents amount");
        }

    }
}
