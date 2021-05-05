package AleMele_;
import java.util.Scanner;
public class ShoppingListI {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1 and its price:");
        String item1 = scan.next();
        double price1 = scan.nextDouble();
        System.out.println("Enter Item2 and its price");
        String item2 = scan.next();
        double price2 = scan.nextDouble();
        System.out.println("Enter Item3 and its price");
        String item3 = scan.next();
        double price3 = scan.nextDouble();
        double totalPrice = price1 + price2 + price3;
        System.out.println("Total Price: $" + totalPrice);
    }

}
