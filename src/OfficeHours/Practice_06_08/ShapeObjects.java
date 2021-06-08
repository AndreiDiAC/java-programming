package OfficeHours.Practice_06_08;

public class ShapeObjects {
    public static void main(String[] args) {

        Shape shape1 = new Shape();
        shape1.calculateArea();

        Square squareOne = new Square();
        squareOne.side = 5;
        squareOne.calculateArea();
        System.out.println(squareOne.area);
        System.out.println(squareOne);

        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 3;
        rectangle1.length = 4;
        rectangle1.calculatePerimeter();
        rectangle1.calculatePerimeter();
        System.out.println(rectangle1);

        Circle circle = new Circle();
        circle.radius = 10;
        circle.calculateArea();
        circle.calculatePerimeter();
        System.out.println(circle);

    }
}
