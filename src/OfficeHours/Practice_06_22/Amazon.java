package OfficeHours.Practice_06_22;

public class Amazon extends OnlineShopping implements AllowUserToSell{
    @Override
    public boolean payForShipping(double price) {
        return price > 50;
    }

    @Override
    public void buyItem() {
        System.out.println("buying item from amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item from amazon");
    }


    @Override
    public void viewCart() {
        System.out.println("Viewing Amazon Cart");
    }

    @Override
    public void uploadProduct() {

    }
}
