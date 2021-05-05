package day18_conditions_practice_strings_intro;

public class CarLeasingTEst {
    public static void main(String[] args) {
        String make = "a";
        String model ="E";
        int leasePrice = 0;

        if(make.equals("Mercedes")){
            if(model.endsWith("E")){
                leasePrice = 500;
            }else if(model.equals("A")){
                leasePrice = 400;
            }
        }else if(make.equals("Audi")){
            if(model.equals("SQ5")){
                leasePrice = 552;
            }else if(model.equals("A3")){
                leasePrice = 412;
            }
        }else{
            System.out.println("Invalid make");
            return;
        }
        System.out.println("Your make you choose is " + make + " model " + model + " with a lease of $" +  leasePrice);
    }
}
