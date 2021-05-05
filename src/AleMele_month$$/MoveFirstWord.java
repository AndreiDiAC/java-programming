package AleMele_month$$;

/**
 [Move first word]
 Given a sentence. Display the sentence with the first word moved to the end of the sentence.
 Ex:
 input: Java is a fun language
 output: is a fun language Java
 Hint: Use indexOf and substring
 */
public class MoveFirstWord {
    public static void main(String[] args) {
        String str = "orice este bine venit";
        String java = str.substring(0, str.indexOf(" "));
        String cut = str.substring(str.indexOf(" ") +1);
        System.out.println(cut + " " + java);
    }
}
