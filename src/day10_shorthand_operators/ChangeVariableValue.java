package day10_shorthand_operators;

public class ChangeVariableValue {
    public static void main(String[] args) {
        int count = 10;
        count = 15;
        count = count +5;
        System.out.println(count);
        count = count + 5;
        System.out.println("count = " + count);


        double fuelPrice = 2.75;
        fuelPrice = fuelPrice - 1.0;
        System.out.println("fuelPrice = " + fuelPrice);

        int apples = 5;
        System.out.println("apples = " + apples);
        apples = apples + 10;
        System.out.println("apples = " + apples);
        apples =  apples - 3;
        System.out.println("apples = " + apples);

        int pizzaSlices = 8;
        System.out.println("pizzaSlices = " + pizzaSlices);
        pizzaSlices = pizzaSlices / 2;
        System.out.println("pizzaSlices = " + pizzaSlices);
        pizzaSlices = pizzaSlices + 6;
        System.out.println("pizzaSlices = " + pizzaSlices);
        
        int players = 10;
        System.out.println("players = " + players);
        players = players *2;
        System.out.println("players = " + players);

        int cents = 568;
        System.out.println("cents = " + cents);
        cents = cents % 100;
        System.out.println("remaining cents = " + cents);



    }

}
