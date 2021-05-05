package day24_loops;

public class WhileLoopApples {
    public static void main(String[] args) {
        int apples = 1;
        while (apples <= 10){
            System.out.println(apples + " -- Eating a apple");
            ++apples;
        }
        System.out.println("No more apples");
    }

}
