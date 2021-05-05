package AleMele_month$$.Arrays_4_10;

import java.util.Arrays;

public class Gradebook {
    public static void main(String[] args) {
        String[] namesArr = {"Mike","Joe","Ana","Ali","Joanna"};
        int[] scoreArr = {80, 54, 100, 66, 94};
        char[] gradeArr = new char[namesArr.length];


        char gradeScale = 'A';


        for (int i = 0; i < namesArr.length; i++){
            if(scoreArr[i] >= 85){
                gradeArr[i] = 'A';
            }else if(scoreArr[i] >= 75 && scoreArr[i] < 85){
                gradeArr[i] = 'B';
            }else if(scoreArr[i] >=65 && scoreArr[i] <75){
                gradeArr[i] = 'C';
            }else{
                gradeArr[i] = 'D';
            }
        }
        System.out.println(Arrays.toString(gradeArr));

        for (int i = 0; i < namesArr.length; i++){
            System.out.println(namesArr[i] + " | " + scoreArr[i] + " | " + gradeArr[i] );
        }

    }
}
