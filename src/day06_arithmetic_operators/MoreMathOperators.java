package day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args) {
        int toyota = 431;
        int hondas = 233;
        int vw = 2;
        int tesla = 20;
        int nissan = 1;
        int bmw = 155;
        int totalCarsInParking = toyota + hondas + vw + tesla + nissan + bmw;
        System.out.println("There are " + totalCarsInParking + " cars in parking.");

        // or int toyota = 431, hondas = 233, vw = 2, tesla = 20, nissan = 1, bmw = 155,


        String pizza = "hawaiian";
        int sclice = 8;
        int people = 4;

        int slicesPerPerson = sclice / people;
        System.out.println("There are " + slicesPerPerson + " slices per person.");
        System.out.println("We ordered " + pizza + " pizza with " + sclice + " slices" + ", "
                + people + " people ate " + slicesPerPerson + " slices each.");



    }
}
