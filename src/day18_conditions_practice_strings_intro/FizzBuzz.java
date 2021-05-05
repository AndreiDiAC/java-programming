package day18_conditions_practice_strings_intro;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
//        int num = 1;
//        if (num % 3 == 0 && num % 5 ==0){
//            System.out.println("FizzBuzz");
//        }else if(num % 3==0){
//            System.out.println("Fizz");
//        }else if( num % 5 == 0){
//            System.out.println("Buzz");
//        }else{
//            System.out.println("NO FIZZ NO BUZZ");
//        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scan.nextInt();

        if (number % 3 == 0){
            if (number % 5 == 0){
                System.out.println("FizzBuzz");
            }else{
                System.out.println("Fizz");
            }
        }
        else if (number % 5 == 0){
            System.out.println("Buzz");
        }
    }
}
