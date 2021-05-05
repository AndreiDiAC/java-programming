package AleMele_month$$.Loops;
import java.util.Scanner;
/**
 Biggest substring of matching characters
 Given a String find the biggest substring of chars that match and print
 it.
 Ex: aaabbbcccccddddee
 Output: ccccc
  */


public class BiggestStringAndreyType {
    public static void main(String[] args) {

        String str = "aaaabbeeeeee";
        String storage = "";
        String max = "";


        if(str.charAt(0)==str.charAt(1)) { storage = "" + str.charAt(0);}

        for (int i = 1; i < str.length(); i++ ) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                storage += "" + str.charAt(i);
                if(storage.length() > max.length()){
                    max = storage;
                }
            }
            else { storage = "" + str.charAt(i);}
        }
        System.out.println(max);
    }
}



