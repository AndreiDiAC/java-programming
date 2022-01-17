package day55_abstraction_interface.Interface_demo;

public interface MyInterface {
    public abstract void lear();

}

interface MyInterface2 {

}


class MyClass implements MyInterface, MyInterface2{

    @Override
    public void lear() {
        System.out.println("Learning in MyClass");
    }
}

class Main {
    public static void main(String[] args) {
//        MyInterface myInterface = new MyInterface();  ERROR can not create object of interface
        MyClass myClass = new MyClass();
    }
}
