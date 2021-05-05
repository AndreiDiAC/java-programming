package AleMele_;
import java.util.Scanner;
public class ApartmentLeasing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Aparments!");
        System.out.println("Number of bedrooms you are interested:");
        int numberOfBedrooms = s.nextInt();
        int startingPrice = 0;
        if (numberOfBedrooms == 1){
            System.out.println("One Bedroom Selected");
            System.out.println("Starting Price: " + (startingPrice = 1100));
        }else if( numberOfBedrooms==2){
            System.out.println("Two Bedroom Selected");
            System.out.println("Starting Price: " + (startingPrice = 1850));
        }else if( numberOfBedrooms ==3){
            System.out.println("Three Bedroom Selected");
            System.out.println("Starting Price: " + (startingPrice = 2550));
        }else{
            System.out.println("No such Bedrooms available");
        }
    }
}
