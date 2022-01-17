package day57_abstraction_polymorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {


    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.draw();

        Shape circle =new Circle();
        circle.draw();

        Shape square = new Square();
        square.draw();

        List<Shape> shapes = new ArrayList<>();
        shapes.add(triangle);
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(triangle);
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Square());
        shapes.add(new Circle());

        for(Shape shape: shapes){
            shape.draw();
        }

        drawShape(new Circle());
        drawShape(new Square());

    }

    /**
     * static method:
     */

    public static void drawShape(Shape object){
        System.out.println("----Drawing Shape----");
        object.draw();
    }
}
