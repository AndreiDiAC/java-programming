package day57_abstraction_polymorphism.AbstractVSInterface;

public interface InterfaceA {


    //Interfaces can ONLY have PUBLIC STATIC FINAL variable
    public static final String TYPE = "interface";
    double MAX_COUNT = 500; //this is also public static final
//    private int num;  -> not allowed


//    public InterfaceA(){} -> no constructor on interface

    public abstract void absMethodD(int num);


    //Starting from java 8, static and default methods are allowed in interfaces
    public static void staticMethodE(String str){
        System.out.println("staticMethodE is called with str - " + str);
    }


    //default method is a method with a body in the interface
    public default void defaultMethodF(){
        System.out.println("defaultMethodF is called");
    }
}
