package day57_abstraction_polymorphism.AbstractVSInterface;

public class Runner {
    public static void main(String[] args) {
/**
 *          AbstractA absA = new AbstractA();
 *         InterfaceA iA = new InterfaceA();    We can not create object(instantiate) neither of them
 */

        InterfaceA.staticMethodE("anything");
//        ConcreteA.staticMethodE("hello"); -> staticMethodE can be called just from interface

    }
}
