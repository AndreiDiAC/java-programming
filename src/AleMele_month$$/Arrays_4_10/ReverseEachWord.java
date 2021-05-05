package AleMele_month$$.Arrays_4_10;

import java.util.Arrays;

/**
 Reverse Each word
 Given a String, reverse each individual word and print the result
 Hint: Use a nested loop, split
 Input:
 It started to snow in Chicago
 Output:
 tI detrats ot wons ni ogacihC
 */
public class ReverseEachWord {
    public static void main(String[] args) {
        String word = "it started to snow in Chicago";
        String[] wordArr = word.split(" ");
        System.out.println(Arrays.toString(wordArr));

        for (int i = 0; i < wordArr.length; i++){
            for (int l = wordArr[i].length()-1; l >= 0 ; l--){
                System.out.print(wordArr[i].charAt(l));
            }
            System.out.print(" ");
        }
    }
}
