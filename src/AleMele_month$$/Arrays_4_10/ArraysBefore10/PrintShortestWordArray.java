package AleMele_month$$.Arrays_4_10.ArraysBefore10;

import java.util.Scanner;

public class PrintShortestWordArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] word = new String[6];
        for ( int i = 0; i < word.length; i++){
            word[i] = s.nextLine();
        }

        String min = word[0];

        for( String each: word){
            if(each.length() < min.length()){
                min = each;
            }
        }
        System.out.println(min);
    }
}
