package AleMele_month$$.Arrays_4_10;
import java.util.*;

/**
 In the sport of diving, seven judges award a score between 0 and 10, where each score may be a floating-point value.

 The highest and lowest scores are thrown out, and the remaining scores are added together.
 The sum is then multiplied by the degree of difficulty for that dive. The degree of difficulty ranges from 1.2 to 3.8 points.
 The total is then multiplied by 0.6 to determine the divers score.

 Flow:

 Accept the 7 scores from the judges
 Accept the difficulty number
 Display the final score
 Enter score for judge 1:
 1
 Enter score for judge 2:
 5
 Enter score for judge 3:
 5
 Enter score for judge 4:
 5
 Enter score for judge 5:
 5
 Enter score for judge 6:
 8
 Enter score for judge 7:
 9
 Enter difficulty:
 2.1
 Total: 35.28
 */
public class Diving {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float[] score = new float[7];
        for (int i = 0, f = 1 ; i < score.length; i++, f++){

            System.out.println("Enter score for judge " + f + ":");
            score[i] = s.nextFloat();
            while(score[i] < 0 || score[i] > 10){
                System.out.println("Score has to be in the range of 1 and 10.\nEnter score:");
                score[i] = s.nextFloat();
            }
        }
        Arrays.sort(score);
//        System.out.println(Arrays.toString(score));
        float sum =0;
        for( int i = 1; i < score.length -1; i++){
            sum += score[i];
        }
//        System.out.println("sum = " + sum);
        System.out.println("Enter difficulty:");
        float diff = s.nextFloat();
        while(diff <= 1.2 || diff >= 3.8){
            System.out.println("Difficulty has to be in the range of 1.2 and 3.8\nEnter difficulty:");
            diff = s.nextFloat();
        }
        diff*=sum;
//        System.out.println("diff = " + diff);
        float total = diff * 0.6f;
        System.out.println("Total: " + total);
    }
}
// TODO: 4/11/2021 Random instead of Scanner