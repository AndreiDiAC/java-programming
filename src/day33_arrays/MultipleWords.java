package day33_arrays;

import java.util.Arrays;

/**
 Multiple Words
 Given a String of words that are separate by commas. Find and print any words
 that have more than one word
 Example
 Input: "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge,
 dish washer”
 Output:
 wooden spoons
 trash can
 dish washer
 */
public class MultipleWords {
    public static void main(String[] args) {
        String words = "knife, wooden spoons, plates, cup, forks, pan, pot, trash can, fridge, dish washer";

        String[] wordsArr = words.split(", ");
        System.out.println(Arrays.toString(wordsArr));
        for( String each: wordsArr){
            if(each.contains(" "))
                System.out.println(each);
        }
    }
}
