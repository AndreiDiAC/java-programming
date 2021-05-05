package day12_conditional_statements;

public class IfElseStatements {
    public static void main(String[] args) {
//        int points = 90;
//        System.out.println("Your points: " + points);
//        if(points>60){
//            System.out.println("Congratz!! You pass the exam!");
//        }else{
//            System.out.println("You fail!!");
//        }
        if (10 > 5) {
            System.out.println("Condition is TRUE");
        }else{
            System.out.println("Condition is False");
        }

        int count = 25; //false
        if (count > 30) {
            System.out.println("count is more then 30");
        }else {
            System.out.println("count is less then 30");
        }
        byte age = 25;
        if (age >= 18) {
            System.out.println("Eligible to vote");
            System.out.println("Age is grater or equal to 18");
        }else{
            System.out.println("Not Eligible to vote");
            System.out.println("Age is less then 18");
        }
    }

}
