package day57_abstraction_polymorphism.AbstractVSInterface;

public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB{
    //a class can extend ONE Abstract class, and implements more interfaces
    // Concrete class is fist non-abstract child class of Abstract class or interface


    //Concrete sub class must override abstract methods from abstract class or interface
    @Override
    public void absMethodA() {
        System.out.println("absMethodA implementation is called");
    }


    // Sub class can override non-final methods from parent class
    @Override
    public void methodB(){
        System.out.println("methodB overridden is called");
    }


//    @Override -> static methods are hidden
    public static void staticMethodC(){
        System.out.println("staticMethodC hidden version is called");
    }


    @Override
    public void absMethodD(int num) {
        System.out.println("absMethodD overridden version is called - " + num);
    }
}
