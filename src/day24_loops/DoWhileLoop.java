package day24_loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int num = 20;
        do{
            System.out.print(num + " ");
            num--;
        }while (num >= 0 );
        System.out.println();



        System.out.println("linia a doua");
        int count = 100;
        do{
            System.out.println(count);
            count+= 5;
        }while ( count <= 1000);

    }
}
