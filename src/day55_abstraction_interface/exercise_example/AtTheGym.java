package day55_abstraction_interface.exercise_example;

public class AtTheGym {
    public static void main(String[] args) {
        Exercises exercise = new Running();
        Exercises running = new Running();
        Exercises swimming = new Swimming();
        Exercises freeWeight = new FreeWeight();  //polymorphism benefit of abstraction. later

        exercise.start();
        exercise.perform();
        System.out.println("Running 30 mins - calories = " + exercise.getCaloriesCount(30));

        running.start();
        running.perform();
        System.out.println("Running 20 mins - calories = " + running.getCaloriesCount(20));

        swimming.start();
        swimming.perform();
        System.out.println("Swimming 30 mins - calories = " + swimming.getCaloriesCount(15));
    }
}
