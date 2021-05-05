package day19_class_vs_object_strings;

import java.util.Locale;

public class StartsWith {
    public static void main(String[] args) {
        String word = "selenium";

        System.out.println(word.startsWith("s"));
        System.out.println(word.startsWith("selen"));

        System.out.println(word.endsWith("ium"));


        if(word.startsWith("s")){
            System.out.println("word starts with s");
        }else{
            System.out.println("doesn't starts with else");
        }
//------------------------------------------------------
        String result = word.startsWith("s") ? "da" : "nu";
        boolean bool = word.endsWith("m") ? true : false;
        System.out.println(result);
        System.out.println(bool);
        //---------------------------------------------

        String x = "intellij idea";
        System.out.println(x.startsWith("intellij idea"));

//------------------------------------------------------
        String name = "mr.";
        if(name.startsWith("Mr.")){
            System.out.println("man");
        }

    }
}
