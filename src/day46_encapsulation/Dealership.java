package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car car1 = new Car();
//        car1.model = "Nissan Altima"; model is private so you can not access it

        car1.setModel("Nissan Altima");
        System.out.println(car1.getModel());

        car1.setYear(2020);
        System.out.println("car1 = " + car1.getYear());

        car1.setMileage(55000);
        System.out.println("car1 = " + car1.getMileage());

        System.out.println(car1.toString());
        System.out.println(car1);

        Car alphaRomeo = new Car();
        alphaRomeo.setModel("Alpha Romeo Giulia Ti AWD");
        alphaRomeo.setYear(2017);
        alphaRomeo.setMileage(16000);

        System.out.println(alphaRomeo);
        System.out.println(alphaRomeo.getModel());
        System.out.println(alphaRomeo.getYear());
        System.out.println(alphaRomeo.getMileage());
    }
}
