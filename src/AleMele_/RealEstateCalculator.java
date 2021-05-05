package AleMele_;
import java.util.Scanner;
public class RealEstateCalculator {
    public static void main(String[] args) {
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE
        System.out.println("Enter your property type:");
        houseType = scan.nextLine();
        if(houseType.equals("Condo")){
            propertyPrice = 50_000;
        }else if(houseType.equals("TownHouse")){
            propertyPrice = 75_000;
        }else if(houseType.equals("Single Family Home")){
            propertyPrice = 95_000;
        }
        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();
        propertyPrice += numberOfBedrooms * 30_000;
        System.out.println("Do you have backyard?");
        backyard = scan.nextBoolean();
        if(houseType.equals("Condo") && backyard==true){
            System.out.println("Backyard is not available for condo!");
        }else if(backyard == true) {
            propertyPrice += 5000;
        }
        System.out.println("Do you have garage?");
        garage = scan.nextBoolean();
        System.out.println("How many spots?");
        garageSpots = scan.nextInt();
        if(garage == true && garageSpots < 10){
            propertyPrice += garageSpots * 20_000;
        }else if(garage == true && garageSpots > 10){
            System.out.println("Pardon, it's not public parking!");
        }
        System.out.println("How close is metro station?");
        metroAccessibility = scan.nextFloat();
        if(metroAccessibility <= 1){
            propertyPrice += 10_000;
        }else if (metroAccessibility >1 && metroAccessibility <3){
            propertyPrice += 5000;
        }
        System.out.println("How close is highway?");
        highwayAccessibility = scan.nextFloat();
        if (highwayAccessibility <= 1){
            propertyPrice += 15_000;
        }else if(highwayAccessibility >1 && highwayAccessibility< 5){
            propertyPrice += 8000;
        }else if( highwayAccessibility >5 && highwayAccessibility <= 20){
            propertyPrice += 4000;
        }
        System.out.println("What's the rating of nearest school?");
        schoolScore = scan.nextFloat();
        if(schoolScore <= 10 && schoolScore>=8){
            propertyPrice += 45_000;
        }else if(schoolScore <8 && schoolScore >=4){
            propertyPrice += 20_000;
        }else{
            propertyPrice += 5000;
        }
        System.out.println("Does any of your family members smoke?");
        smoking = scan.nextBoolean();
        if(smoking){
            propertyPrice -= 5000;
        }
        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: $" + propertyPrice);
    }
}
