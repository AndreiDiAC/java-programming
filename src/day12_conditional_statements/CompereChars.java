package day12_conditional_statements;

public class CompereChars {
    public static void main(String[] args) {
        char letter1 = 'A';
        char letter2 = 'J';
        System.out.println("\"A\" > \"J\" - \n\t\t\t" + (letter1 > letter2));
        System.out.println(letter1 < letter2);
        System.out.println(letter1 == letter2);

        char grade = 'E';
        boolean pass = grade <= 'D';
        System.out.println("Did you pass the exam? - " + pass);

    }
}
