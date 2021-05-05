package AleMele_month$$.Loops;

import java.util.Random;

/**
 Generate a random number that is six digits long. Each digit in this
 number should be unique, meaning the number 6 digit number should
 have 6 different character numbers that make it up. Print the number.

 HINTS: Loops, Strings, Random
 **/

public class ChallengeRandom {
    public static void main(String[] args) {
        Random input = new Random();
        String storage = "";

        while(storage.length() <6){
            int r = input.nextInt(9);
            String letterInd = "" +r;

            if(!storage.contains(letterInd)){
                storage += r + "";
            }else if(storage.length() == 6 ){
                break;
            }
        }
        System.out.println(storage);

    }
}
