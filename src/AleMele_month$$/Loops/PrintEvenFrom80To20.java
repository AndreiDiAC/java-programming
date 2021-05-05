package AleMele_month$$.Loops;

public class PrintEvenFrom80To20 {
    public static void main(String[] args) {


//        for(int loop = 80; loop <=80 && loop >=20; loop-- ){
//            if(loop %2==0){
//                System.out.print(loop + " ");
//            }
//        }
//

        int loop = 80;
        while (loop <=80 && loop >=20){
            if(loop %2 ==0){
                System.out.print(loop + " ");
            }
        loop--;
        }
    }
}
