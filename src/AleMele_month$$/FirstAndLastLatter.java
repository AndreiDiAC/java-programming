package AleMele_month$$;
import java.util.Scanner;
public class FirstAndLastLatter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String reverse = "" + word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);

        if(word.length() == 5){
            System.out.println(reverse);
        }else if (word.length() < 5){
            System.out.println("Too short!");
        }else{
            System.out.println("Too long");
        }
    }
}
