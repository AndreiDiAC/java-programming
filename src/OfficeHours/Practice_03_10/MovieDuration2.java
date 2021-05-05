package OfficeHours.Practice_03_10;
import java.util.Scanner;
public class MovieDuration2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the movie:");
        double movieLength = s.nextDouble();
        double price = 0;
        if(movieLength == 1){
            price = 8.99;
        }
        if(movieLength == 1.5){
            price = 10.55;
        }
        if(movieLength == 2){
            price = 12.99;
        }
        if(movieLength==2.5){
            price = 14.50;
        }
        if(movieLength <= 0){
            System.out.println("Invalid length");
        }else{
            System.out.println("price = " + price);
        }

    }
}
