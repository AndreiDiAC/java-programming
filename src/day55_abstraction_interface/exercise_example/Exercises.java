package day55_abstraction_interface.exercise_example;

public abstract class Exercises {
    public void start(){   //non-abstract method
        System.out.println("Warming up and starting the exercise");
    }

    /**
     * -abstract method - method without body/impl, just signature
     * -purpose: letting sub classes implement/override their own way
     */
    public abstract void perform();

    /**
     * other abstract method that concrete sub classes will override/implement
     * @param minutes - how long is exercise is perform
     * @return number of calories burned/used
     */
    public abstract int getCaloriesCount(int minutes);
}
