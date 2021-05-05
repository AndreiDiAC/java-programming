package AleMele_month$$.Arrays_4_10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ChallengeRandomArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Enter array size:");
        int size = s.nextInt();
        System.out.println("Enter max number for random:");
        int maxRan = s.nextInt();
        System.out.println(maxRan);
        int[] rArray = new int[size];
        for(int i = 0; i < size; i++){
            rArray[i] = r.nextInt(maxRan);
        }
        System.out.println(Arrays.toString(rArray));
    }
}
