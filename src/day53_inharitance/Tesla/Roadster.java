package day53_inharitance.Tesla;

public class Roadster extends ElectricCar{

    public Roadster( String model, double price, int year, int range) {
        super("Tesla", model, price, year, range);
        System.out.println("Welcome new Roadster");
    }
}
