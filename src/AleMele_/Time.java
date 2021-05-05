package AleMele_;
import java.util.Scanner;
public class Time {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your HOUR, MINUTE, SECOND and AM or PM here:");
        int hour = scan.nextInt();
        int minute = scan.nextInt();
        int second = scan.nextInt();
        scan.nextLine();
        String amORpm = scan.nextLine();
        System.out.println(hour + ":" + minute + ":" + second + amORpm);
    }
}
