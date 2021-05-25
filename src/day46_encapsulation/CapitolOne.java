package day46_encapsulation;

public class CapitolOne {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNumber((int) 1234567891112312L);
        acc.setBalance(250);
        acc.setAccountHolder("Mike Smith");
        acc.setType("360 checking");
        System.out.println(acc);
    }
}
