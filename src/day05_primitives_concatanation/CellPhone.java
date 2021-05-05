package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args) {
        String brand = "IPhone";
        byte model = 12;
        String color = "Blue";
        float price = 1199.99f;
        int storage = 256;
        boolean hasCamera = true;

        System.out.println(brand + "\n" + model + "\n" + color + "\n" + price + "\n" + storage + "\n" + hasCamera);

        System.out.println("Brand is: " + brand);
        System.out.println("Model is: " + model);
        System.out.println("Color is: " + color);
        System.out.println("Price is $" + price);
        System.out.println("Storage is " + storage +"GB");
        System.out.println("Has Camera? - " + hasCamera);


    }
}
