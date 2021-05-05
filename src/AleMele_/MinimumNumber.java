package AleMele_;
/*
Write a java program that accepts three numbers and return the minimum number (assume that none of them are equal)
 */
public class MinimumNumber {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 3;
        int num3 = 2;

        if (num1 < num2 && num1 < num3){
            System.out.println(num1);
        }else if(num2 < num1 && num2 <num3){
            System.out.println(num2);
        }else{
            System.out.println(num3);
        }
    }
}
