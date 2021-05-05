package AleMele_;

public class Employee {
    public static void main(String[] args) {
        String firstName =  "Andrei";
        String lastName = "Diaconu";
        String companyName = "MyCompany";
        double salary =  125000;
        byte startDay = 1;
        short startMonth = 12;
        int startYear = 2020;
        boolean isFullTime = true;
        String jobTitle = "SDET";
        String officeAddress = "5440 N Kimball Ave";

        String fullName =  firstName + " " + lastName;
        String fullStartingDate = startMonth + "." + startDay + "." + startYear;
        String email =  firstName + startDay + "@" + companyName + ".com";
        double salaryAfter3Years = salary + startMonth * 10000;

        System.out.println("\t******* MyCompany New Hire Information *******");
        System.out.println(firstName + " welcome to Tesla");
        System.out.println("Your started date as " + jobTitle + " will be on " + fullStartingDate);
        System.out.println("You are fulltime: " + isFullTime + " and will he making $" + salary + " per year");
        System.out.println("The office is located at: " + officeAddress);
        System.out.println("\tOfficial information:");
        System.out.println("New hire name: " + fullName);
        System.out.println("Starts on: " + fullStartingDate);
        System.out.println("Email generated: " + email);
        System.out.println("Your expected salary after 3 years: $" + salaryAfter3Years);

    }
    /*
    ==============================================================================

Create a class Employee
create a main method

    Declare and assign these variables according to the most appropriate datatypes: (Use as many datatypes as you can for practice)

        - first name, last name, company name, salary, start day, start month, start year, are they full time, job title, office address,

    Declare new variables and use concatenation from previous variables to set their values

        - full name (first and last name)
        - full start date (start month date, year)
        - email (first name + start day @ $company name .com)
        - Salary after 3 years (base salary + start month * 10000)
            Ex: base: 100000
                start day: 2
                after 3 year: (100000 + (2 * 1000)) = 102000

    Display the values of the variables following given example image

==============================================================================
     */
}
