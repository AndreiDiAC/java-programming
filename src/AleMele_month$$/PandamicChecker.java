package AleMele_month$$;
import java.util.Scanner;
/**
 [Pandemic Checker]
 Write a program that will read a number from the user. This number will be a year. Use that
 given year to figure out if there was a pandemic in that year, and if there was which one.
 Data to use:
 1346-1353: The Black Death
 1665-1666: Great Plague of London
 1770-1772: Russian plague
 1889-1890: Flu pandemic
 1916: American polio epidemic
 1918-1920: Spanish Flu
 2009-2010: H1N1 Swine Flu pandemic
 2014-2016: West African Ebola epidemic
 2020-2021: COVID-19
 Less than 0 and more then 2021: Invalid year
 Any year not in those ranges: No Pandemic
 */
public class PandamicChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = s.nextInt();

        if(year >=0 && year <=2021) {
            if (year >= 1346 && year <= 1353) {
                System.out.println("The Black Death");
            } else if (year >= 1665 && year <= 1666) {
                System.out.println("Great Plaque of London");
            } else if (year >= 1770 && year <= 1772) {
                System.out.println("Russian plague");
            } else if (year >= 1889 && year <= 1890) {
                System.out.println("Flu pandemic");
            } else if (year == 1916) {
                System.out.println("American polio Flu");
            } else if (year >= 1918 && year <= 1920) {
                System.out.println("Spanish Flu");
            } else if (year >= 2009 && year <= 2010) {
                System.out.println("H1N1 Swine Flue Pandemic");
            } else if (year >= 2014 && year <= 2016) {
                System.out.println("West African Ebola epidemic");
            } else if (year >= 2021 && year <= 2021) {
                System.out.println("Covid-19");
            } else {
                System.out.println("No Pandemic");
            }
        }else{
            System.out.println("Invalid year");
        }
    }

}
