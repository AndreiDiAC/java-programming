package AleMele_month$$.Loops;

/**
 [IQ] Duplicate characters
 Given a String, find and print the duplicate characters. A character is
 duplicate if it appears more than once in the String.
 Ex:
 AAABCCDEEF
 Output:
 ACE
 */
public class DupicateCharacters {
    public static void main(String[] args) {
        String str = "AAABCCDEEF";
        String duplicate = "";

        for ( int i = 0; i < str.length() -1; i++){
            if(str.indexOf(str.charAt(i)) == str.indexOf(str.charAt(i+1))){
                if(!duplicate.contains(""+str.charAt(i))){
                    duplicate += str.charAt(i);
                }
            }
        }
        System.out.println(duplicate);
    }
}
