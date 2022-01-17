package day55_abstraction_interface.exercise_example;

public class Running extends Exercises{


    @Override
    public void perform() {
        System.out.println("Performing Running exercise");
    }


    /**
     *
     * @param minutes - how long is exercise is perform
     * @return we are assuming avg of calories while running is 13
     */
    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 13;
    }
}
