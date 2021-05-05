package day24_loops;

public class UnreadSMS {
    public static void main(String[] args) {
        int unreadSMS = 10;
        while (unreadSMS > 0){
            System.out.println(unreadSMS + " - \uD83D\uDCE7 less");
            unreadSMS--;
        }
        System.out.println("No more messages");
    }
}
