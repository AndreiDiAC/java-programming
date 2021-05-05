package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {

        String city = "Chicago";

        city.equalsIgnoreCase("Chicago");
        System.out.println(city);

        String word = "java";
        System.out.println(word.equals("java")); //TRUE
        System.out.println(word.equals("JAVA")); //FALSE
        System.out.println(word.equalsIgnoreCase("Java")); //TRUE




        city = "Chicago";

        if(city.equals("CHICAGO")) {
            System.out.println("equals() true");
        }else{
            System.out.println("equals() false"); /// falsse
        }

        if (city.equalsIgnoreCase("CHICAGO")){
            System.out.println("equalsIgnoreCase true");
        }else{
            System.out.println("equalsIgnoreCase false");
        }
    }
}
