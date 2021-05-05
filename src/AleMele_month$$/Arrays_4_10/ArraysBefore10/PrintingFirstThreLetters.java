package AleMele_month$$.Arrays_4_10.ArraysBefore10;

import java.util.Scanner;

public class PrintingFirstThreLetters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] arr = new String[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextLine();
        }

        if(arr.length >= 3){
            for(String each: arr){
                System.out.println(each.substring(0,3));
            }
        }

    }
}
