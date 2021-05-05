package day21_string_maipulation;

public class StringIndexOf {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.indexOf("j"));//0
        System.out.println(word.indexOf("jav")); //0 iti da prima litera
        System.out.println(word.indexOf("altceva")); //-1
    }
}
