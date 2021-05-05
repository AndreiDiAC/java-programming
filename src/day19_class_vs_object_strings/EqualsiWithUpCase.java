package day19_class_vs_object_strings;

import java.util.Locale;

public class EqualsiWithUpCase {
    public static void main(String[] args) {

        String countryCode = "usa";
        if(countryCode.equals(countryCode.toUpperCase())){
            System.out.println("They are not equals");
        }else{
            System.out.println("They are not equals");
        }

//Ternary
        String x = countryCode.equals(countryCode.toUpperCase()) ? "equals" : "not equals";
        System.out.println(x);

//-------------------------------------------
        String word = "UK";
        String uWord = word.toUpperCase();

        System.out.println(word);
        System.out.println(uWord);

        if (word.equals(uWord)){
            System.out.println("case match");
        }else {
            System.out.println("case mismatch");
        }
    }
}
