package AleMele_month$$.Loops;

public class PrimeV2 {
    public static void main(String[] args) {

        int n = 50;

        for (int i = 2; i <= n; i++){
           if (i % 2 != 0 && i %3 != 0 && i%5 != 0 && i%7 != 0 || i==2 || i ==3 || i ==5 || i == 7){
                System.out.print(i + " ");
            }
        }
    }
}
