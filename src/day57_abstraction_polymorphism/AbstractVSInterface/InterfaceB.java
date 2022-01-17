package day57_abstraction_polymorphism.AbstractVSInterface;

import java.io.Serializable;

public interface InterfaceB extends InterfaceA, Serializable, Cloneable {

    //Interface CAN EXTEND MULTIPLE OTHER INTERFACES. Interface support Multi-Inheritance

    //When it extends another interface, child interface is not responsible to override any methods.


}
