package day15_logicalops;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'A';
        if (grade == 'A' || grade == 'B' || grade =='C'){
            System.out.println("Passed! You get " + grade);
        }else if (grade == 'D'){
            System.out.println("Qualify for retake!");
        }else if (grade == 'E'){
            System.out.println("Fail!");
        }else{
            System.out.println("Invalid Grade");
        }
        // if ((grade == 'A' || grade = 'a') ||  (grade == 'B' || grade == 'b')
        // || (grade =='C' || grade == 'c' ))      - for lower case too

    }
}
