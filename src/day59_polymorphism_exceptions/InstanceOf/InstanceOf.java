package day59_polymorphism_exceptions.InstanceOf;

import day55_abstraction_interface.WebDriver.ChromeDriver;
import day55_abstraction_interface.WebDriver.WebDriver;
import day57_abstraction_polymorphism.shapes.Circle;
import day57_abstraction_polymorphism.shapes.Shape;
import day57_abstraction_polymorphism.shapes.Square;
import day59_polymorphism_exceptions.WebElem.Link;
import day59_polymorphism_exceptions.WebElem.WebElement;

public class InstanceOf {
    public static void main(String[] args) {
        Shape shape = new Circle();
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Square);
        System.out.println(shape.getClass());
        if(shape instanceof Circle){
            System.out.println("It is a Circle object");
        } else if(shape instanceof Square){
            System.out.println("It is a Square object");
        }

        /**
         * java reflection API
         */
        System.out.println(shape.getClass().getSimpleName()); //just class name of object
        System.out.println(shape.getClass().getName()); //class name of object and package name
        if(shape.getClass().getSimpleName().equals("Square")){
            System.out.println("It isa Circle object");
        }
        System.out.println(shape.getClass().getDeclaredMethods().length);

        WebElement el = new Link();
        System.out.println("object class name of el variable = " + el.getClass().getSimpleName());

        ChromeDriver driver = new ChromeDriver();
        WebDriver a = driver;
    }

}
