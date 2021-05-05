package AleMele_;
/*
Your school goes on a Field trip each year. The place you go will be based on your grade.
 Given some grade number (1-6) figure out the details of your field trip. Print the information at the end.

    Data based on grade:

        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt
 */
public class FieldTrip {
    public static void main(String[] args) {
        int grade = 1;
        String location, teacherInCharge;
        int numberOfGroups;
        switch (grade){
            case 1:
                System.out.println("location - " + (location = "Apple Orchard"));
                System.out.println("number of groups - " + (numberOfGroups = 3));
                System.out.println("teacher in charge - " + (teacherInCharge = "Ms. Sam"));
                break;
            case 2:
                System.out.println("location - " + (location = "Zoo"));
                System.out.println("number of groups - " + (numberOfGroups = 7));
                System.out.println("teacher in charge - " + (teacherInCharge = "Mr. Lee"));
                break;
            case 3:
                System.out.println("location - " + (location = "Aquarium"));
                System.out.println("number of groups - " + (numberOfGroups = 5));
                System.out.println("teacher in charge - " + (teacherInCharge = "Mr. Wilson"));
                break;
            case 4:
                System.out.println("location - " + (location = "Movie Theater"));
                System.out.println("number of groups - " + (numberOfGroups = 2));
                System.out.println("teacher in charge - " + (teacherInCharge = "Ms. Reyes"));
                break;
            case 5:
                System.out.println("location - " + (location = "Museum"));
                System.out.println("number of groups - " + (numberOfGroups = 5));
                System.out.println("teacher in charge - " + (teacherInCharge = "Ms. Lela"));
                break;
            case 6:
                System.out.println("location - " + (location = "Six Flags"));
                System.out.println("number of groups - " + (numberOfGroups = 8));
                System.out.println("teacher in charge - " + (teacherInCharge = "Mr. Watt"));
                break;
        }
    }

}
