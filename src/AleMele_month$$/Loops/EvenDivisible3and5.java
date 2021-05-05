package AleMele_month$$.Loops;

public class EvenDivisible3and5 {
    public static void main(String[] args) {
        int num = 0;
        do{
            if(num % 2 == 0){
                if(num % 3 ==0){
                    if(num % 5 ==0){
                        System.out.println(num);
                    }
                }
            }
            num++;
        }while(num <= 100);
    }
}
