package $OOP.CreditCard;

public class CreditCard {
    long cardNumber;
    double balance;
    double apr;
    boolean cashback;

    public CreditCard(long cardNumber,double balance){
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public void useCard(){

    }

    public void payBalance(){

    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber=" + cardNumber +
                ", balance=" + balance +
                ", apr=" + apr +
                ", cashback=" + cashback +
                '}';
    }
}
