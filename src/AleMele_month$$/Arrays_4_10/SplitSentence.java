package AleMele_month$$.Arrays_4_10;

public class SplitSentence {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        String[] sentenceArr = sentence.split(" ");
        for( String each: sentenceArr){
            System.out.println(each);
        }
    }
}
