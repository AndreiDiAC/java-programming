package day56_abstraction.Transportation;

import day56_abstraction.Greeting.Greeting;

public class Tesla extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void transportPeople() {
        System.out.println("Tesla is transporting people on the rood");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla cost " + (mile * 0.10) + " to drive " + mile + " mile");
    }

    @Override
    public void autoPiloting() {
        System.out.println("Tesla is selfDrivable");
    }

    @Override
    public void hi() {
        System.out.println("Tesla is saying 'hello hello'");
    }

    @Override
    public void bye() {
        System.out.println("Tesla is say 'bye'");
    }
}
