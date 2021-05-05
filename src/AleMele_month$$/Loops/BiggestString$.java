package AleMele_month$$.Loops;

/**
 * Biggest substring of matching characters Given a String find the biggest
 * substring of chars that match and print it.
 * Ex: aaabbbcccccddddee
 * Output: ccccc
 */

public class BiggestString$ {
    public static void main(String[] args) {


        String str = "aaabbbcccccddddee";
        String storage = "";
        String max = "";


        for (int i = 0; i < str.length(); i++) {
            for (int f = i; f < str.length(); f++) {
                if (str.charAt(i) == str.charAt(f)) {
                    storage += str.charAt(f);
                }else{
                    i = f-1;
                    break;
                }
            }

            if (storage.length() > max.length())
                max = storage;

            storage = "";
        }
        System.out.println("Biggest substring: " + max);
    }
}