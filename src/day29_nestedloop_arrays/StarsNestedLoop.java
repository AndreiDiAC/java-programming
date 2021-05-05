package day29_nestedloop_arrays;

public class StarsNestedLoop {
    public static void main(String[] args) {

        for ( int i = 1; i <= 5; i++){
            for ( int j = 1; j <= 10; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println();



        System.out.println();
        for (int outer = 1; outer <=10; outer++){
            for( int inner = 1; inner <= outer; inner++){ // <= outer
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
