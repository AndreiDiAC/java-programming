package day18_conditions_practice_strings_intro;

public class ThreeNumbers {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;
        int num3 = 3;

        if(num1 >= num2 && num2 >= num3){
            System.out.println(num1 + " - num1 is the largest");
        }else if(num2 >= num1 && num2 >= num3){
            System.out.println(num2 + " -num2 nu is the largest");
        }else{
            System.out.println(num3 + " - num3 is the largest");
        }
    }
}
