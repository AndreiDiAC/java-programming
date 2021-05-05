package AleMele_month$$;

/**
 [Remove first and last]
 Given two words. Print the first word without its first character then print the second word
 without its last character.
 Input:
 apple
 banana
 Output:
 pple
 banan
 */
public class RemoveFirstAndLast {
    public static void main(String[] args) {
        String word1 = "asa ce nu";
        String word2 = "anything";

        System.out.println(word1.substring(1));
        System.out.println(word2.substring(0, word2.length()-1));
        System.out.println(word2.length()-1);

    }
}
