package AleMele_;
import java.util.Scanner;
public class ConditionalStatementPractice3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = s.next();
        if (name.equals("Chen")){
            System.out.println("teacher");
        }else{
            System.out.println("student");
        }
    }


}
