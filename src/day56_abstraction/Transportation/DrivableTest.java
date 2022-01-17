package day56_abstraction.Transportation;

public class DrivableTest {
    public static void main(String[] args) {
        Tesla model13 = new Tesla();
        model13.hi();
        model13.transportPeople();
        model13.autoPiloting();
        model13.cost(25);
        model13.stop();
        model13.bye();

        Plane plane = new Plane();
        plane.hi();
        plane.transportPeople();
        plane.autoPiloting();
        plane.cost(250);
        plane.land();
        plane.stop();
        plane.bye();

        //Polymorphism learn next

        SelfDrivable sd = new Plane();
        SelfDrivable sd2 = new Tesla();
    }
}
