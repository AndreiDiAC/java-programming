package AleMele_month$$.Loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String storage = "";
        String coma = "";
        double totalPrice = 0;
        for( int i = 1; i <= 10; i++) {
            System.out.println("Enter Item" + i + " and its price:");
            String item = s.next();
            double price = s.nextDouble();
            System.out.println("Add one more item?");
            String answer = s.next();
                storage += coma + "Item" + i + ": " + item + " Price: " + price;
                totalPrice += price;
                coma = ", ";
            if (answer.toLowerCase().equals("yes")) {
            } else if (answer.toLowerCase().equals("no")) {
                System.out.println(storage);
                System.out.println("Total price: " + totalPrice);
                return;

            }
        }

    }
}
