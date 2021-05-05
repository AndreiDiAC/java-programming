package AleMele_;
/*
create a class named Apartment
create a main method

    Create the variables with the most appropriate datatype:

        - address, name of owner, number of units, average size of each unit, monthly rent amount, number of washers and driers,
        allows pets or not, has a pool, length of lease, total number of residents in building, phone number of owner,
        is near a gas station, number of floors, has a basement, has available units for rent, has air conditioning,
        number of parking spaces, has wheel chair access, number of review stars (out of 5)

        - Create these variables and use previous variables to get the values

            - monthly rent after 3 years (discount 10% off original rent)
            - monthly rent after 6 years (discount 20% off original rent)
            - Average number of residents per unit (total residents / number of units)
            - Average number of parking spots per unit ( parking spots / units)
            - Average number of units per floor ( units / number of floors)
 */

public class Apartament {
    public static void main(String[] args) {
        String address = "5440 N Kimbal Ave";
        String nameOfOwner= "Andrei Diaconu";
        byte numberOfUnits = 12;
        short averageSizeOfEachUnit = 1000;
        double monthlyRentAmount = 1199.99;
        byte numberOfWasherAndDriers = 4;
        boolean allowsPetsOrNot =true;
        boolean hasAPool = true;
        short lenghtOfLease = 1;
        int totalNumberOfResidents = 24;
        long phoneNumberOfOwner = 7734070888L;
        boolean isNearAGasStation = true;
        byte numberOfFloors = 3;
        boolean hasABasement = false;
        boolean hasAvailableUnitsForRent = true;
        boolean hasAirConditioning = false;
        short numberOfParkingSpace = 15;
        boolean hasWeelChairAccess = true;
        byte numberOfReviewStars = 5;

        //monthly rent after 3 years (discount 10% off original rent)
        double discount =monthlyRentAmount * 0.1;
        double monthleyRentAfter3Years = monthlyRentAmount - discount;
        System.out.println("monthleyRentAfter3Years = " + monthleyRentAfter3Years);

        //monthly rent after 6 years (discount 20% off original rent)
        double monthleyRentAfter6Years = monthlyRentAmount - monthlyRentAmount *0.2;
        System.out.println("monthleyRentAfter6Years = " + monthleyRentAfter6Years);

        //Average number of residents per unit (total residents / number of units)
        int averageNumberOfResidentsPerUnit = totalNumberOfResidents / numberOfUnits;
        System.out.println("averageNumberOfResidentsPerUnit = " + averageNumberOfResidentsPerUnit);

        //Average number of parking spots per unit ( parking spots / units)
        double averageNumberOfParkingSportPerUnit = (double)numberOfParkingSpace / numberOfUnits;
        System.out.println("averageNumberOfParkingSportPerUnit = " + averageNumberOfParkingSportPerUnit);

        //Average number of units per floor ( units / number of floors)
        double averageNumberOfUnitsPerFloor =numberOfUnits / numberOfFloors;
        System.out.println("averageNumberOfUnitsPerFloor = " + averageNumberOfUnitsPerFloor);

    }
}
