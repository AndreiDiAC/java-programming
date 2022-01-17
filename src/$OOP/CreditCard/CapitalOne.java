package $OOP.CreditCard;

public class CapitalOne extends CreditCard{
    public CapitalOne(long cardNumber, double balance) {
        super(cardNumber, balance);
        this.cashback = false;
        this.apr = 14.35;
    }

    @Override
    public void useCard(){
        System.out.println("Using Capital One card");
    }

    public void payBalance(double balance){

        System.out.println("Playing " + balance + " from " + this.balance);
        this.balance -= balance;
    }

    @Override
    public String toString() {
        return "Capitol One credit card | " +
                "card number: " + cardNumber +
                " | balance ued: " + balance +
                " | APR: " + apr +
                " | cashback: " + cashback;
    }
}
