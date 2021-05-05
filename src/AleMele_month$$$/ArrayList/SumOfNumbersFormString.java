package AleMele_month$$$.ArrayList;

/**
 [Sum of Numbers from String]

 Create a method that will accept a String and returns the sum of all the numbers in the String.

 Requirement: any numbers that are next to each other are not single digit numbers but instead read as a full number
 Ex: a5bc12def100g
 Here we would have added 5 + 12 + 100
 NOT: 5 + 1 + 2 + 1 + 0 + 0
 */


public class SumOfNumbersFormString {
    public static int sumNumsFromString(String str){
        int sum = 0;
        for (int i = 0; i < str.length();i++){

            if(Character.isDigit(str.indexOf(str.charAt(i)))){
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
//                  sum += Integer.valueOf("" + str.charAt(i));     the same statement with the above one
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumNumsFromString("a5bc12def100g "));
    }
}
