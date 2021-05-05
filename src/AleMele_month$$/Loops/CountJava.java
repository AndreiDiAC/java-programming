package AleMele_month$$.Loops;

/**
 Print the number of times that the string "java" appears anywhere in the given string word

 Example:

 input: javaxjava

 output: 2
 input: javaxjava

 output: 2
 Example:

 input: javaxjavaapplepearjavaegg

 output: 3
 */
public class CountJava {
    public static void main(String[] args) {
        String word = "javaxjava";
        int count = 0;

        for ( int i = 0; i < word.length()-3; i++){
            String java = word.substring(i,i+4);
            if(java.equals("java")){
                count += 1;
            }
        }
        System.out.println(count);
    }
}
