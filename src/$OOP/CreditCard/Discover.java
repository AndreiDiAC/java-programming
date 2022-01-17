package $OOP.CreditCard;

public class Discover extends CreditCard {


    public Discover(long cardNumber, double balance) {
        super(cardNumber, balance);
        this.apr = 11.99;
        this.cashback = true;
    }

    @Override
    public void useCard(){
        System.out.println("Using Discover card");
    }


    public void payBalance(double balance){
        System.out.println("Paying " + balance + " from " + this.balance);
        this.balance -= balance;
    }

    @Override
    public String toString() {
        return "Discover credit card | " +
                "card number: " + cardNumber +
                " | balance ued: " + balance +
                " | APR: " + apr +
                " | cashback: " + cashback;
    }
}
