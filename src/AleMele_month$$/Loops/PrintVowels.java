package AleMele_month$$.Loops;

public class PrintVowels {
    public static void main(String[] args) {
        String word = "howdyho";
        String vowels = "";


        for( int i = 0; i < word.length();i++){
            if(word.charAt(i) == 'a' || word.charAt(i)== 'e'|| word.charAt(i)== 'i'
                    || word.charAt(i)== 'o' || word.charAt(i)== 'u'){
                System.out.print(word.charAt(i));
            }

        }
    }

}
