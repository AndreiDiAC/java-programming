package AleMele_month$$;

/**
 [Salary Calculator]
 Given the following information: hourly rate, weekly hours, and number of weeks. Check if all
 the inputs are valid and then calculate the salary.
 - hourly rate cannot be negative or zero
 -> If invalid print: Hourly Rate cannot be Negative or Zero
 - weekly hours cannot be zero, negative or more than 65
 -> If invalid print: Weekly Hours cannot be less than 1 or greater than 65
 - number of weeks cannot be less than 1 and more than 52
 -> If invalid print: Number of weeks cannot be less than 1 or greater than 52
 Equation: salary = hourly rate * weekly hours * number of weeks
 */

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 50;
        int weeklyHours = 67;
        int numberOfWeeks = 48;
        if (hourlyRate <= 0){
            System.out.println("Hourly Rate cannot be Negative or Zero");
            return;
        }
        if ( weeklyHours <= 0 || weeklyHours >65){
            System.out.println("Weekly Hours can not be less then 1 or grater then 65.");
            return;
        }
        if (numberOfWeeks < 1 || numberOfWeeks > 52){
            System.out.println("Number of weeks can not be less then 1 or grater then 52.");
            return;
        }
        System.out.println("salary = $" + (hourlyRate * weeklyHours * numberOfWeeks));
    }
}
