package AleMele_month$$;
// TODO: 3/22/2021  
/**
 Given a house type (String) print out the number of max occupants (int)
 Tree house: 1
 Mobile home: 2
 Apartment: 4
 Town house: 6
 Villa: 8
 Mansion: 10
 -> Try to use variables instead of printing multiple times
 */
public class HouseOccupants {
    public static void main(String[] args) {
        String house = "Mobile HoMe";
        int occupnats = 0;

        house = house.toLowerCase();
            switch (house) {
                case "tree house":
                    occupnats = 1;
                    break;
                case "mobile home":
                    occupnats = 2;
                    break;
                case "apartment":
                    occupnats = 4;
                    break;
                case "town house":
                    occupnats = 6;
                    break;
                case "villa":
                    occupnats = 8;
                    break;
                case "mansion":
                    occupnats = 10;
                    break;
                default:
                    System.out.println("Invalid input");
                    return;
            }
            System.out.println(house + " has " + occupnats + " occupants.");
        }

    }
