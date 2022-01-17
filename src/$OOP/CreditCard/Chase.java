package $OOP.CreditCard;

public class Chase extends CreditCard{


    public Chase(long cardNumber, double balance) {
        super(cardNumber, balance);
        this.apr = 10.99;
        this.cashback = true;
    }

    @Override
    public void useCard() {
        System.out.println("Using Chase card");
    }

    public void payBalance(double balance){

        System.out.println("Paying " + balance + " from " + this.balance);
        this.balance -= balance;
    }

    @Override
    public String toString() {
        return "Chase credit card | " +
                "card number: " + cardNumber +
                " | balance ued: " + balance +
                " | APR: " + apr +
                " | cashback: " + cashback;
    }


}
