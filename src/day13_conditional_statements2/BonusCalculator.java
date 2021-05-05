package day13_conditional_statements2;

public class BonusCalculator {
    public static void main(String[] args) {
        int bonus = 0;
        double salesAmount = 2000.55;
        if (salesAmount <= 1000) {
            System.out.println("Good job, you qualified for " + (bonus = 50) + "$ bonus");
        } else {
            System.out.println("Great job, you are qualified for full " + (bonus = 100) + "$ bonus");
        }
    }
}
