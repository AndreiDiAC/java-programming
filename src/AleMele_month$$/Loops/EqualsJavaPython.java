package AleMele_month$$.Loops;

/**
 Given a string, print out true if the number of appearances of "java" anywhere in the string
 is equal to the number of appearances of "python" anywhere in the string (case sensitive).

 Example:

 input: We study java not python

 output: true
 input: We study java not python

 output: true
 Example:

 input: What's the difference between java, javascript and python?

 output: false
 */
public class EqualsJavaPython {
    public static void main(String[] args) {
        String sentence = "What's the difference between, javascript and python?";
        int countOfJava = 0;
        int countOfPython = 0;

        for( int i = 0; i < sentence.length()-3;i++){
            String java = sentence.substring(i, i+4);
            if(java.equals("java")){
                countOfJava +=1;
            }
        }
        for( int i = 0; i <sentence.length()-5; i++){
            String python = sentence.substring(i, i+6);
            if(python.equals("python")){
                countOfPython += 1;
            }
        }

        if(countOfJava == countOfPython){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
