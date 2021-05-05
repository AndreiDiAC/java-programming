package day33_arrays;

import java.util.Arrays;

public class ReverseWithStrings {
    public static void main(String[] args) {
        System.out.println("String reverse in the same variable");
        String[] words = {"java","html", "js","ruby", "css"};
        System.out.println("Before reverse words: \t\t" + Arrays.toString(words));

        for (int i = 0,f = words.length-1; i < words.length/2; i++, f--){
            String tempWords = words[i];
            words[i] = words[f];
            words[f] = tempWords;
        }

        System.out.println("After the reverse: \t\t" + Arrays.toString(words));
    }
}
