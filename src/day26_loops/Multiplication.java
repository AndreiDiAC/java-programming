package day26_loops;

public class Multiplication {
    public static void main(String[] args) {
        int num = 10;

        if(num > 10 || num < 0 ){
            System.out.println("Invalid input!");
            return;
        }
        for (int i = 1; i <= 10; i++) {
            for (int a = 1; a <= 10; a++) {
                System.out.print(i + " * " + a + " = " + (i * a) + "\t\t");
            }
            System.out.println();
        }
    }
}
