package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        System.out.println("Even numbers: ");
        for(int i = 1; i <=100; i++ ){
            if(i % 2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println("\nOdd numbers:");
        for(int k = 0; k <100; k++){
            if(k % 2 != 0){
                System.out.print(k + " ");
            }
        }

    }
}
