package AleMele_month$$.Arrays_4_10.ArraysBefore10;

import java.util.Scanner;

/**
 Given the array words find and print the word with the largest length. Assume that there are no 2 words with longest length

 Example:

 words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]

 Outputs: jaaaaavvaaaaaaaaaa
 */
public class FindMaxLengthStringArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] word = new String[5];
        for ( int i = 0; i < 5; i++){
            word[i] = s.nextLine();
        }

        String max = word[0];
        for(String each: word){
            if(each.length() > max.length()){
                max = each;
            }
        }
        System.out.println(max);
    }
}
