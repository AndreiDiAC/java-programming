package day15_logicalops;

public class UsedCarSelector {
    public static void main(String[] args) {
        double carPrice = 5_000;
        String model = "Toyota";
        double budget = 7000;
        if (carPrice <= budget && model.equals("Honda") || model.equals("Toyota") || model.equals("Tesla")){
            System.out.println("The car is in the carPrice and it is an " + model);
        }else{
            System.out.println("Not in carPrice, not the car what I want");
        }
    }
}
