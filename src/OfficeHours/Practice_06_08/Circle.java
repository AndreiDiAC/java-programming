package OfficeHours.Practice_06_08;

public class Circle extends Shape{

    double radius;
    double diameter = radius * 2;

    @Override
    public void calculateArea() {
        area = Math.PI * Math.pow(radius,2);
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
