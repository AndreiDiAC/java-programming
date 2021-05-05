package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in parking lot = " + cars);
        cars = cars + 2;
        System.out.println("cars = " + cars);
        cars += 5;
        System.out.println("cars = " + cars);
        cars -= 6;
        System.out.println("cars = " + cars);

        int eclectricCars = 13;
        cars += eclectricCars;
        System.out.println("cars in parking lot = " + cars);

        String word = "java";
        System.out.println("word = " + word);
        word = word + " programing";
        System.out.println(word);

        //add "is fun"
        word += " is fun";
        System.out.println(word);

        String selenium = " but \"selenium\" is more fun.";
        word += selenium;
        System.out.println("word = " + word);

        word += 12345; //add 12345 to word
        System.out.println(word);

        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        letter += 1;
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("normal parking Fee = " + parkingFee);
        //early bird fee is 50 off
        //parkingFee = parkingFee / 2;
        parkingFee /= 2;
        System.out.println("early bird parkingFee = " + parkingFee);

        //weekend parkinf is free
        parkingFee -= parkingFee;
        System.out.println("weekend parkingFee = " + parkingFee);







    }
}
