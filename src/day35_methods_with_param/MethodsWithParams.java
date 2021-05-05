package day35_methods_with_param;

import java.util.*;

public class MethodsWithParams {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();


        displayValue(5);
        displayValue(10);
        int count = 55;
        displayValue(count);
        displayValue(random.nextInt(10));
//        System.out.println("Enter scan number:");
//        displayValue(s.nextInt());

        greetByName("Andrei");
        greetByName("Nadir");
        String name = "Saim";
        greetByName(name);
    }




    public static void displayValue(int num){
        System.out.println("This is our value: " + num);
    }


    /**
     * method name: greetByName
     * @para/input: String name
     * It prints"Hello {name}, how are you today?
     */
    public static void greetByName(String name){
        System.out.println("Hello " + name + " how are you today?");
    }
}
