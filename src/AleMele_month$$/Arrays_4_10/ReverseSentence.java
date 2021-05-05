package AleMele_month$$.Arrays_4_10;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Java is fun";

        String[] sentenceArr = sentence.split(" ");


        for (int i = 0; i < sentenceArr.length/2; i++){
            String temp = sentenceArr[i];
            sentenceArr[i] = sentenceArr[sentenceArr.length-1-i];
            sentenceArr[sentenceArr.length-1-i] = temp;
        }
        System.out.println(String.join(" ", sentenceArr));

    }
}
