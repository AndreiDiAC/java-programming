package AleMele_month$$.Loops;

/**
 Given an int variable n print out n asterisks. So if n=5, five asterisks will be printed.

 Example:

 input: 1

 output: *
 input: 1

 output: *
 Example:

 input: 3

 output: ***
 */
public class PrintTimes {
    public static void main(String[] args) {
        int n = 4;
        String asterisks = "";
//        for(int loop = 0; loop < n; loop++){
//            asterisks += "*";
//        }
//        System.out.println(asterisks);
        int loop = 0;
        while(loop < n){
            asterisks += "*";
            loop++;
        }
        System.out.println(asterisks);
    }
}
