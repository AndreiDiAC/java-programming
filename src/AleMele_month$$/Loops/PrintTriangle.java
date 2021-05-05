package AleMele_month$$.Loops;

/**
 Write a program that will create a triangle of asterisks based on size n.

 Example:

 input: 5

 output:
 *
 **
 ***
 ****
 *****
 input: 5

 output:
 *
 **
 ***
 ****
 *****
 Example:

 input: 3

 output:
 *
 **
 ***
 */
public class PrintTriangle {
    public static void main(String[] args) {
        int num = 10;
        String asterisks = "";

//        for (int i = 0; i < num; i++){
//            asterisks += "*";
//            System.out.println(asterisks);
//        }
        int loop =  0;
        while (loop <num){
            asterisks += "*";
            System.out.println(asterisks);
            loop++;
        }
    }
}
