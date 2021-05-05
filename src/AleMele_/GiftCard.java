package AleMele_;
import java.util.Scanner;
public class GiftCard {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String item = s.next();
        System.out.println("Thank you for your purchase!");
        int balance = 100;

        if (item.equals("Blanket")){
            System.out.println("Your current balance is: " + (balance -= 60) + "$");
        }else if(item.equals("Charger")){
            System.out.println("Your current balance is: " + (balance -= 25) + "$");
        }else if(item.equals("Hat")){
            System.out.println("Your current balance is: " + (balance -= 25) + "$");
        }else if(item.equals("Headphone")){
            System.out.println("Your current balance is: " + (balance -= 30) + "$");
        }else if(item.equals("Laptop") || item.equals("Smartphone")){
            System.out.println("Sorry, not enough founds on your gift card!");
        }else if(item.equals("Pants")){
            System.out.println("Your current balance is: " + (balance -= 50) + "$");
        }else if(item.equals("Socks")){
            System.out.println("Your current balance is: " + (balance -= 5) + "$");
        }else if(item.equals("USB cable")){
            System.out.println("Your current balance is: " + (balance -= 10) + "$");
        }else{
            System.out.println("Invalid item!");
        }

    }
}
