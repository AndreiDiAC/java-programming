package $OOP.VendingMachine2;

import java.util.Arrays;

public class Objects {
    public static void main(String[] args) {
        Drink drink1 = new Drink("Cola",2.99,10);
        Drink drink2 = new Drink("Pepsi",2.79,8);
        Drink drink3 = new Drink("Sprite",2.49,12);

        DrinkVendingMachine vendingMachine = new DrinkVendingMachine();

        vendingMachine.drinks.addAll(Arrays.asList(drink1,drink2,drink3));

        System.out.println(vendingMachine.drinks);

//        vendingMachine.select(1);
//        System.out.println("vendingMachine.current = " + vendingMachine.current);
//        System.out.println("vendingMachine = " + vendingMachine.amountLeftToPay);
//        System.out.println(vendingMachine.isSelected);
//        System.out.println("vendingMachine.pay(5) = " + vendingMachine.pay(4));
//        System.out.println(vendingMachine.change);
//        System.out.println(vendingMachine.current.getQuantity());

        System.out.println(vendingMachine.returnChange());


    }
}
