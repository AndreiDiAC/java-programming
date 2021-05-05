package AleMele_;
import java.util.Scanner;
public class SchoolGrade {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        String subjectName1 = s.next();
        double score1 = s.nextDouble();
        System.out.println("Please enter subject name number 2 and score for this subject");
        String subjectName2 = s.next();
        double score2 = s.nextDouble();
        System.out.println("Please enter subject name number 3 and score for this subject");
        String subjectName3 = s.next();
        double score3 = s.nextDouble();
        System.out.println("Please enter subject name number 4 and score for this subject");
        String subjectName4 = s.next();
        double score4 = s.nextDouble();
        System.out.println("Please enter subject name number 5 and score for this subject");
        String subjectName5 = s.next();
        double score5 = s.nextDouble();
        double averageScore = (score1 + score2 + score3 + score4 + score5) / 5;
        System.out.println("Summary: " + subjectName1 + " - " + score1 + ", " + subjectName2 + " - "
                + score2 + ", " + subjectName3 + " - " + score3 + ", " + subjectName4 + " - "
                + score4 + ", " + subjectName5 + " - " + score5);
        System.out.println("Your average score is: " +  averageScore);
        System.out.println("Thank you for using Grader!");
        System.out.print("Goodbye!");
    }

}
