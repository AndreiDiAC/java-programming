package AleMele_month$$.Loops;

public class OddDivisible3and5 {
    public static void main(String[] args) {
        for(int i = 0; i <=100; i++){
            if(i % 2 != 0 && i % 3 == 0 && i % 5 == 0){
                    System.out.println(i);
                }
            }
        }
    }

