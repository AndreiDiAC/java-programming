package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args) {
        String carModel = "BMW";
        String driverName = "Andrei";
        String licenseNum = "ABDEFLDS";
        int speed = 60;
        boolean isAutomatic = true;
        char licenseClass = 'M';

        System.out.println("Car model:" + carModel);
        System.out.println("Driver Name:" + driverName);
        System.out.println("License Number: " + licenseNum);
        System.out.println("Speed: " + speed + "m/h");
        System.out.println("Is Automatic: " + isAutomatic);
        System.out.println("Gender Owner: " + licenseClass);

        System.out.println("Car model is " + carModel + ".");
        System.out.println(driverName + " is driving a car.");
        System.out.println(driverName + " is driving a " + carModel + ".");
        System.out.println("Current speed is " + speed + "MPH.");
        System.out.println(carModel + driverName);

        int a = 10;
        double b = 3.4;
        System.out.println(carModel + isAutomatic + licenseClass);




    }
}
