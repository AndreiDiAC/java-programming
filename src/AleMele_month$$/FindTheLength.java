package AleMele_month$$;
import java.util.Scanner;
/**
 Write a program that will output length of the text (string).

 Example:

 Display message: "Please enter the text:"
 Display message: "Please enter the text:"
 input: java
 copied!
 input: java
 Display message: "Length is: 4"
 */
public class FindTheLength {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the text:");
        String length = s.next();

        System.out.println("Length is : " + (length.length()));

    }
}
