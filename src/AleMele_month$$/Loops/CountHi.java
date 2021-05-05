package AleMele_month$$.Loops;

/**
 Print out the number of times that the string "hi" appears anywhere in the given string.
 Only lowercase "hi" should be counted.

 Example:

 input: abc hi how hi

 output: 2
 input: abc hi how hi

 output: 2
 Example:

 input: hi code java please

 output: 1
 */
public class CountHi {
    public static void main(String[] args) {
        String str = "abc hi how hi";
        int count = 0;

        for (int i = 0; i < str.length() -1; i++){
            String hi = str.substring(i, i+2);
            if(hi.equals("hi")){
                count += 1;
            }
        }
        System.out.println(count);
    }
}
