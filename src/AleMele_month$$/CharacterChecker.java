package AleMele_month$$;

/**
 [Character Checker]
 Given a letter (char) determine if the character is an uppercase letter or lowercase letter
 Ex: 'b' --> lowercase
 'G' --> uppercase
 'O' --> uppercase
 Hint: Use the ASCII table
 */
public class CharacterChecker {
    public static void main(String[] args) {
        char letter = 'A';

        if(letter >=97 && letter <=122){
            System.out.println(letter + " --> lowercase");
        }else if(letter >= 65 && letter <= 90 ){
            System.out.println(letter + " --> uppercase");
        }else{
            System.out.println("Invalid Input");
        }

    }
}
