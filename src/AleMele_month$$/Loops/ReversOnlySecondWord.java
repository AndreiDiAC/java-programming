package AleMele_month$$.Loops;

/**
 Reverse only second word
 Given a String with three words separated by spaces. Reverse only the
 second word and return the modified String
 Ex:
 I love java
 I evol java
 */
public class ReversOnlySecondWord {
    public static void main(String[] args) {
        String str = "I love java";
        String reverse = "";
        String midWord = str.substring(str.indexOf(" ")+1,str.lastIndexOf(" "));
        String firstWord = str.substring(0, str.indexOf(" "));
        String thirdWord = str.substring(str.lastIndexOf(" ")+1);
        for ( int i = midWord.length()-1; i >= 0; i--){
            reverse += midWord.charAt(i);
        }
        System.out.println(firstWord + " " + reverse + " " + thirdWord);


    }
}
