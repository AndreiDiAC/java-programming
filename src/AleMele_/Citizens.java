package AleMele_;
import java.util.Scanner;
public class Citizens {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens");
        int seniorCitizens = s.nextInt();
        int nonSeniorCitizens = s.nextInt();
        System.out.println("What is new citizen's age?");
        int age = s.nextInt();
        if(age >= 65){
            System.out.println("Senior Citizen");
            seniorCitizens ++;
        }else if (age <= 65){
            System.out.println("Non-Senior Citizen");
            nonSeniorCitizens++;
        }
        System.out.println("New seniorCitizen count " + seniorCitizens);
        System.out.println("New nonSeniorCitizen count " + nonSeniorCitizens);
    }
}
