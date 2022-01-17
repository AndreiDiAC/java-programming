package day55_abstraction_interface.exercise_example;

public class Swimming extends Exercises{

    @Override
    public void perform() {
        System.out.println("Performing swimming in a pool or ocean");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 24;
    }
}
