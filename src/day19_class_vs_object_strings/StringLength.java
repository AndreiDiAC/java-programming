package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String password ="anything";
        System.out.println(password.length()); //8

        if(password.length()>=6){
            System.out.println("valid amazon password");
        }else{
            System.out.println("password too short");
        }

    //----------------------------------------------------

        String word = "java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("wood spoon ".length());
        System.out.println("Nadir".length());

        String firstName = "Andrei";
        System.out.println(firstName + "-" + firstName.length());

        int count = firstName.length();
        System.out.println("count = " + count);
    //--------------------------------------------------------------
        String password1 = "abc123";



    }
}
