package day24_loops;
import java.util.*;
public class GivenMe5$ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Give me 5 dollars");
        int dollar = s.nextInt();
        while (dollar != 5 &&  dollar < 5){
            System.out.println("Give me 5 dollars");
            dollar = s.nextInt();
        }
        System.out.println("Thank you for $" + dollar);
    }
}
