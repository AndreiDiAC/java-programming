package day55_abstraction_interface.exercise_example;

public class FreeWeight extends Lifting{   //need implementation of the methods
    @Override
    public void perform() {
        System.out.println("Lifting Free Weight dumbbells");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes *6;
    }

    @Override
    public void endLyft() {
        System.out.println("Carefully re-rack dumbbells");
    }
}
