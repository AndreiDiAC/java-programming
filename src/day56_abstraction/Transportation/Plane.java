package day56_abstraction.Transportation;

import day56_abstraction.Greeting.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void transportPeople() {
        System.out.println("Plane is transport people");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane cost " + (mile * 25.0) + " to drive " + mile + " mile");
    }

    @Override
    public void autoPiloting() {
        System.out.println("Plane is autoDriving");
    }

    @Override
    public void hi() {
        System.out.println("Welcome aboard");
    }

    @Override
    public void bye() {
        System.out.println("Bye from plane");
    }

    public void land() {
        System.out.println("plane is landing");
    }
}
