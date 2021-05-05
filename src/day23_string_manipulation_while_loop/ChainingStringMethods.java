package day23_string_manipulation_while_loop;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "wooden spoon";

        System.out.println(word.toUpperCase().toLowerCase().length());
        System.out.println(word.toUpperCase().replace(" ",""));

        String city = "ISTANBUL";
        System.out.println(city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase());
        String capitalized = city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase();
        System.out.println(capitalized);



    }
}
