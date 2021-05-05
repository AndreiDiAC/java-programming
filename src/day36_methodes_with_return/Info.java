package day36_methodes_with_return;
import java.util.*;
public class Info {
    public static void main(String[] args) {
        System.out.println(fullName() + " has "+  getAge() + ".\nIs he maried? " + isMaried());
        System.out.println("Full name = " + fullName());
        System.out.println("Age = " + getAge());
        System.out.println("Maried? = " + isMaried());
        System.out.println(fullName());
        System.out.println(a());
        System.out.println("Random year: = " + getRandomYear());
        System.out.println("Random year: = " + getRandomYear());
        String name = fullName();
        boolean married = isMaried();
        int age = getAge();
        int year = getRandomYear();
        System.out.println();
        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);


        if(isMaried()){
            System.out.println("Maried");
        }else{
            System.out.println("Not Maried");
        }

    }

    public static String fullName(){
        System.out.println("inside fullName method");
        return "Mike Smith";

    }

    public static boolean isMaried(){
        return false;
    }

    public static int getAge(){
        return 35;
    }

    public static int a(){
        if(10 < 3){
            return 1 ;
        }else{
            return 0;
        }
    }


    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }



}
