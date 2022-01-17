package day58_polymorphism.SuperMan;

public class Casting {
    public static void main(String[] args) {
        //variable of worker and object of superMan

        Worker worker1 = new SuperMan();
        worker1.work("QA Manager");
        worker1.getPaid();
        ((Father)worker1).raiseKid();
        ((SuperMan)worker1).playWithKid();

        SuperMan superMan = (SuperMan) worker1; //DOWNCASTING FROM WORKER  to SUPERMAN
    }
}
