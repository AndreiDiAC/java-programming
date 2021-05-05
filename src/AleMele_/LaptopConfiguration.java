package AleMele_;

import java.util.Scanner;

public class LaptopConfiguration {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Select screen size:");
        double screenSize = s.nextDouble();
        double laptopPrice = 0.0;
        if(screenSize==13.3){
            laptopPrice += 200;
        }else if(screenSize == 15.0){
            laptopPrice += 300;
        }else if(screenSize == 17.3){
            laptopPrice += 400;
        }
        System.out.println("Select CPU type:");
        String cpuType = s.next();
        if(cpuType.equals("i3")){
            laptopPrice += 150;
        }else if(cpuType.equals("i5")){
            laptopPrice += 250;
        }else if(cpuType.equals("i7")){
            laptopPrice += 350;
        }
        System.out.println("Select RAM size:");
        int ramSize = s.nextInt();
        laptopPrice += (ramSize / 4)*50;
        System.out.println("Select storage type:");
        String storageType = s.next();
        System.out.println("Select storage size:");
        int storageSize = s.nextInt();
        if (storageType.equals("HDD")){
            laptopPrice += storageSize / 500 *50 ;
        }else if(storageType.equals("SSD")){
            laptopPrice += storageSize /500 *100;
        }
        System.out.println("Enter screen resolution");
        String screenResolution = s.next();
        if(screenResolution.equals("FULLHD")){
            laptopPrice += 100;
        }else if(screenResolution.equals("4k")){
            laptopPrice += 200;
        }
        System.out.println("Laptop price is: $" + laptopPrice);
    }
}

