package day53_inharitance.Tesla;

public class CarObjects {
    public static void main(String[] args) {
        ElectricCar ec1 = new ElectricCar("Tesla","Model Y",48.190,2021,326);
        ec1.drive(50);
        System.out.println(ec1);
        System.out.println("ec1 make = " + ec1.getMake());
        System.out.println("ec1 model = " + ec1.getModel());
        System.out.println("ec1 price = " + ec1.getPrice());
        System.out.println("ec1 year = " + ec1.getYear());
        System.out.println("ec range = " + ec1.getRange());

        if(ec1.getPrice() > 10000){
            System.out.println(ec1.getMake() + " - " + ec1.getModel() + " is out of my budget") ;
        }else{
            System.out.println("purchasing " + ec1.toString());
        }

        System.out.println(ElectricCar.getCount());

        ElectricCar ec2 = new ElectricCar("Tesla","CyberTruck",59900,2022,300);
        System.out.println(ec2.toString()); //call static method using object
        System.out.println("Count = " + ElectricCar.getCount());

        Roadster roadster = new Roadster("Roadster",200000,2022,620);
        System.out.println(roadster);
        roadster.drive(1000);
        roadster.drive(600);
        System.out.println(roadster.getCount());

        ModelX myModelX = new ModelX("Tesla","Model X",89990.0,2021,360);
        System.out.println(myModelX);
        myModelX.drive(10);
        System.out.println("Having lunch..");
        myModelX.drive(10);
        System.out.println("Range remaining  = " + myModelX.getRange());
        System.out.println("Total electric cars count = " + ElectricCar.getCount());

    }

}
