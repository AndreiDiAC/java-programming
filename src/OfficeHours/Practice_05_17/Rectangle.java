package OfficeHours.Practice_05_17;

public class Rectangle {

    double height;
    double width;
    double area;

    public void setDimensions(double recHeight, double recWidth){
        height = recHeight;
        width = recWidth;
    }

    public double getArea(){
        area = height * width;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", area=" + area +
                '}';
    }
}
class RectangleObjects {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getArea());
        rectangle.setDimensions(5, 3);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle);

        Rectangle rectangle2 = new Rectangle();
        System.out.println(rectangle2.getArea());
    }
}