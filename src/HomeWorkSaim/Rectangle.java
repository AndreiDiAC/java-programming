package HomeWorkSaim;

public class Rectangle {
    double width, height, area;

    public void setDimensions(double a, double b){
        width = a;
        height = b;
    }
    public int getArea(){
        area = width * height;
        return (int) area;
    }
    @Override
    public String toString() {
        return "width=" + width +
                ", height=" + height +
                ", area=" + area +
                '}';
    }
}

class RectangleObjects{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setDimensions(10,10);
        rectangle.getArea();
        System.out.println("rectangle = " + rectangle.toString());

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setDimensions(3.2,6.3);
        rectangle1.getArea();
        System.out.println("rectangle1 = " + rectangle1.toString());

        Rectangle rectangle2 = rectangle1;
        rectangle2.setDimensions(4,5);
        rectangle2.getArea();
        System.out.println("rectangle2 = " + rectangle2.toString());
        System.out.println("rectangle1 = " + rectangle1.toString());

    }


}