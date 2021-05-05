package day25_loops;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++ ){
            System.out.print(i + " ");
            sum += i; //sum = sum + i;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
