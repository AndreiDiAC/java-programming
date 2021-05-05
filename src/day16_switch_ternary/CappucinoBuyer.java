package day16_switch_ternary;

public class CappucinoBuyer {
    public static void main(String[] args) {
        String size = "tall";
        double price = 0;
        int calories = 0;
        switch (size){
            case "tall":
                System.out.println("Cappuccino Tall size please");
                price = 3.69;
                calories = 90;
                break;
            case "grande":
                System.out.println("Cappuccino Grande size please");
                price = 3.99;
                calories = 120;
                break;
            case "vendi":
                System.out.println("Cappuccino Vendi size pleas");
                price = 4.29;
                calories = 150;
                break;
            default:
                System.out.println("We don t serve that size of Cappuccino");
                break; //optional if default is at the end
        }
        System.out.println("Total price: " + price);
        System.out.println("You will consume "+ calories + "cal of energy");
    }
}
