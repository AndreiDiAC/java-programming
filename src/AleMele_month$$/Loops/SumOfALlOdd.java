package AleMele_month$$.Loops;

public class SumOfALlOdd {
    public static void main(String[] args) {
//        FOR LOOP
//        int sum = 0;
//        for(int i = 0; i <=100; i++){
//            if(i % 2 != 0){
//                sum += i;
//            }
//        }
//        System.out.println(sum);


//        int num = 0;
//        int sum = 0;
//        while(num <= 100){
//            if((num % 2 !=0)){
//                sum += num;
//
//            }
//            num++;
//        }
//        System.out.println(sum);
//          DO loop
        int num = 0;
        int sum = 0;
        do{
            if(num %2 != 0){
                sum += num;
            }
            num++;
        }while(num <= 100);
        System.out.println(sum);
    }
}
