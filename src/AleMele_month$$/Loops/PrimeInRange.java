package AleMele_month$$.Loops;

import java.util.Arrays;

/**
 [IQ] Prime in range
 Given a number. Print out all the prime numbers from 2 to that number
 A prime number is a number that is only divisible by 1 and itself.
 Ex:
 Input: 50
 Output:
 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
 */
public class PrimeInRange {
    public static void main(String[] args) {
        int theNum = 50;

        for (int i = 2; i <= theNum; i++) {
            int prime = 0;
            for (int f = 1; f <= i; f++) {
                if (i % f == 0) {
                    prime++;
                }
            }
            if (prime == 2) {
                System.out.print(i + " ");
            }
        }

    }
}
