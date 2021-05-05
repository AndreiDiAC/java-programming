package AleMele_month$$$.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseLetter {
    public static void main(String[] args) {
        System.out.println(reverseNoSpec("Ab,c,de!$"));

    }

    public static String reverseNoSpec(String str) {
        String result  = "";
        int count = 1;
        for( int i = 0; i < str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                for( int j = str.length()-count; j >= 0;j--){
                    count++;
                    if(Character.isLetter(str.charAt(j))){
                        result += str.charAt(j);
                        break;
                    }
                }
            }else{
                result += str.charAt(i);
            }
        }

        return result;

    }
}
