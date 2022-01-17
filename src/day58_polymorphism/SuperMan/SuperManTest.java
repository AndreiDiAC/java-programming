package day58_polymorphism.SuperMan;

public class SuperManTest {
    public static void main(String[] args) {
        Father spMan1 = new SuperMan();
        spMan1.playWithKid();
        spMan1.feedKid();
        spMan1.raiseKid();
//        spMan1.work("STED");  -> Error spMan1 is Father type can only access methods from Father

        Worker spMan2 = new SuperMan();
        spMan2.work("SDET");
        spMan2.getPaid();

        SuperMan spMan3 = new SuperMan();
        //access of all of the methods
        spMan3.work("SDET");
        spMan3.getPaid();
        spMan3.playWithKid();
        spMan3.playWithKid();
        spMan3.feedKid();
    }
}
