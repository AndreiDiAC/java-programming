package OfficeHours.Practice_06_22;

public class Ebay extends OnlineShopping implements AllowUserToSell{
    @Override
    public void viewCart() {
        System.out.println("Viewing Ebay Cart");
    }

    @Override
    public boolean payForShipping(double price) {
        return price < 100;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying from Ebay");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning from Ebay");
    }

    @Override
    public void uploadProduct() {

    }
}
