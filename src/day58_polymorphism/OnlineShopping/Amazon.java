package day58_polymorphism.OnlineShopping;

import day58_polymorphism.SuperMan.Prime;

public class Amazon extends OnlineShopping implements Prime {
    @Override
    public void buy() {
        System.out.println("Buying items from amazon.com");
    }

    @Override
    public void sell() {
        System.out.println("Selling items on amazon.com");
    }

    @Override
    public void primeShipping() {
        System.out.println("Shipping for prime users");
    }
}
