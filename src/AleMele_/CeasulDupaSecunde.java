package AleMele_;
import java.util.Scanner;

public class CeasulDupaSecunde {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int inputSeconds = scan.nextInt();   //3695

        int hours, minutes, seconds,a ;
        hours = inputSeconds /3600; //1
        a = inputSeconds % 3600;  //95
        minutes = a / 60;
        seconds = a % 60;
        System.out.println(hours +"hours " + minutes +"minutes "+ seconds + "seconds" );
    }
}
