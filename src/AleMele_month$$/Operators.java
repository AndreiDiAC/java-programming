package AleMele_month$$;

/**
 Analyze each step, What is the result of a, b, and c?
 int a = 3, b = 2;
 long c = (a-- + b) * 2 / 3 % 2;
 */
public class Operators {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        long c = (a-- + b) * 2 / 3 % 2;
        System.out.println(c);


        int numOne =10; //11 //12 //13
        int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;
        //           10        * 3 + 12      + 0;
        System.out.println(numTwo);

        int biggest = numOne > numTwo ? numOne: numTwo;
        System.out.println(biggest);
    }
}
