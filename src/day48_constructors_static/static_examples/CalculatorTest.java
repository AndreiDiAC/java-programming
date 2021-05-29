package day48_constructors_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {
        //add is static method, can be called using Classname.staticMethodName
        //static way of calling the method
        Calculator.add(3,4);

        //non static method
        //instance method, and we are creating object then calling it
        Calculator calcObject = new Calculator();
        calcObject.multiply(2,4);
        calcObject.add(4,10);

    }
}
