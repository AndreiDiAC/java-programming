package day32_arrays_split;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "java is fan";
        String[] words = sentence.split(" ");
        for(int i = words.length-1; i >= 0; i--){
            System.out.print(words[i] + " ");
        }
        System.out.println();


        //or
        for(int i = sentence.split(" ").length-1; i >= 0; i--){
            System.out.print(sentence.split(" ")[i] + " ");
        }
    }
}
