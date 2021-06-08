package day49_static;

public class BankAccount {
    static double balance = 500.0;
    String user;

    public void spend(double amount){
        System.out.println(user + " is spending $" + amount);
        balance -= amount;
    }

    public void showBalance() {
        System.out.println("Current balance = " + balance);
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount husband = new BankAccount();
        husband.user = "husband";
        husband.spend(200);
        husband.showBalance();

        BankAccount wife = new BankAccount();
        wife.user = "wife";
        wife.spend(240);
        wife.showBalance();
        husband.showBalance();
        System.out.println(BankAccount.balance);
    }
}

