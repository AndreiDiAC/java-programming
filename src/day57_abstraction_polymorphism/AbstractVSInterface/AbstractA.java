package day57_abstraction_polymorphism.AbstractVSInterface;

public abstract class AbstractA {

    //Abstract classes can have instance variable, static variable with all access modifiers
    int num1;
    private double price;
    public static int count;
    public final String type = "abstract";
    public static final String LANGUAGE = "java";

//    private abstract void absMethodA(); -> abstract methods can not be private, static or final


    public AbstractA(){
        System.out.println("AbstractA constructor");
    }

    public abstract void absMethodA();

    public void methodB(){
        System.out.println("methodB is called");
    }

    public static void staticMethod(){
        System.out.println("staticMethod is called");
    }



}
