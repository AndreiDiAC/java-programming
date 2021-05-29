package day48_constructors_static;

public class BusObjects {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        System.out.println(bus1);
        bus1.driver = new Driver("Andrei");
        bus1.engine = new Engine(10);
        System.out.println(bus1);

        Bus bus2 = new Bus();
        bus2.driver = new Driver("Aziz");
        bus2.engine = new Engine(15);
        System.out.println(bus2.driver.getName());


    }
}
