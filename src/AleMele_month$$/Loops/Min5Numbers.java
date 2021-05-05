package AleMele_month$$.Loops;

import java.util.Scanner;

public class Min5Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number =0;
        int prevNumber = 0;
        int smallest = 0;

        for(int i = 1; i <= 5; i++){

            System.out.println("Enter " + i + "th number:");
            number = s.nextInt();
                smallest = number;

        }
        System.out.println(smallest);
    }
}
