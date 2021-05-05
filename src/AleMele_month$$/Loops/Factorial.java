package AleMele_month$$.Loops;

public class Factorial {
    public static void main(String[] args) {
        int inputNum = 16;
        long factorial = 1l;
        int loop = 1;
//        for(int i = 1; i <= inputNum ; i++){
//            factorial *= i;
//        }
//        System.out.println(factorial);

        while (loop <= inputNum){
            factorial *= loop;
            loop++;
        }
        System.out.println(factorial);

    }
}
