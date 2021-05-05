package AleMele_;
import java.util.Scanner;
public class BurgerChicken {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next();
        if(in.equals("burger")){
            System.out.println("10.0");
        }else if(in.equals("chicken")){
            System.out.println("10.0");
        }else if(in.equals("soda")){
            System.out.println("2.0");
        }else if(in.equals("fries")){
            System.out.println("3.5");
        }
    }
}
