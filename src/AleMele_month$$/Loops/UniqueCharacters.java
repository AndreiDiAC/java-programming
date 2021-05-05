package AleMele_month$$.Loops;

/**
 [IQ] Unique characters
 Given a String, find and print the unique characters. A character is
 unique if it only appears once in the String.
 Ex:
 AAABCCDEEF
 Output:
 BDF
 */
public class UniqueCharacters {
    public static void main(String[] args) {


//     Andreea's better way

        String str = "AAABCCDEEF";
        String uniqueChars = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                uniqueChars += str.charAt(i)+ "";
            }

        }
        System.out.println(uniqueChars);
    }
}
