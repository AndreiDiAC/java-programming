package AleMele_;
import  java.util.Scanner;
public class QuizQuestion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );
        System.out.println("Enter answer:");
        String answer = s.next();
        if(answer.equals("a")){
            System.out.println("a is wrong");
        }else if(answer.equals("b")){
            System.out.println("b is correct");
        }else if(answer.equals("c")){
            System.out.println("c is wrong");
        }else{
            System.out.println(answer +" is not a valid answer");
        }

    }
}
