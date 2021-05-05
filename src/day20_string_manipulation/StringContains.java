package day20_string_manipulation;

import day19_class_vs_object_strings.StartsWith;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i")); //true
        System.out.println(company.contains(("ital"))); //true
        System.out.println(company.contains("One")); //false

        String etsyTitle = "Wooden spoon | Etsy";
        System.out.println(etsyTitle.contains(" | "));

        String firstName = "Ahmed";
        if ( firstName.contains("a") && firstName.contains("e")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        firstName = "Nadir";
        if(firstName.contains("a") || firstName.contains("i")){
            System.out.println("a or i is present");
        }else{
            System.out.println("nor a or i is present");
        }

        String email ="MURODIL@cybertekschool.com";
        if(email.toLowerCase().contains("murodil")){
            System.out.println("merge"); //merge
        }else{
            System.out.println("nu este");
        }


        String word = "java";
        word = word.replace("a", "u");
        System.out.println(word);

    }
}
