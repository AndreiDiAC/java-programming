package AleMele_month$$;

/**
 Given three String variables of some text find and print the longest word that also contains 'a'

 Ex:
 "java"
 "mouse"
 "computer"
 Output: java
 Ex:
 "java"
 "mouse"
 "apples"
 Output: apples

 Challenge: Instead of just checking for 'a' add another variable that can be used to check for any character.
 */
public class LargestWord {
    public static void main(String[] args) {
        String word1 = "java";
        String word2 = "mouse";
        String word3 = "computer";
        String a = "a";

        if (word1.contains(a) && word2.contains(a) && word3.contains(a)){
            if( word1.length() > word2.length() && word1.length() > word3.length()){
                System.out.println(word1);
            }else if(word2.contains("a") && word2.length() > word1.length() && word2.length() > word3.length() ){
                System.out.println(word2);
            }else if(word3.contains("a") && word3.length() > word1.length() && word3.length() > word2.length()){
                System.out.println(word3);
            }
        }else if(word1.contains(a) && word2.contains(a)){
            if(word1.length() > word2.length()){
                System.out.println(word1);
            }else{
                System.out.println(word2);
            }
        }else if(word1.contains(a) && word3.contains(a)){
            if(word1.length() > word3.length() ){
                System.out.println(word1);
            }else{
                System.out.println(word3);
            }
        }else if(word2.contains(a) && word3.contains(a)){
            if(word2.length()>word3.length()){
                System.out.println(word2);
            }else{
                System.out.println(word3);
            }
        }else if(word1.contains(a)){
            System.out.println(word1);
        }else if(word2.contains(a)){
            System.out.println(word2);
        }else if(word3.contains(a)){
            System.out.println(word3);
        }


    }
}
