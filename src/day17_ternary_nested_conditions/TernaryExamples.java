package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 90;
        String quality = "good";
        String result = (score > 60) ? "pass" : "fail";
        int x = (quality.equals("good")) ? 100 : 0;
        char grade =  (score> 90) ? 'A' : 'B';
        String evenOdd = (score%2 == 0) ? "even" : "odd";

        System.out.println(result);
        System.out.println(x);
        System.out.println(grade);
        System.out.println(evenOdd);

        int hourlyRate = 50;
        String reply = hourlyRate > 50 ? "accept" : "reject";


        String todayClass = "java";
        String teacher  = todayClass.equals("java") ? "Muradil" : "Nadir";
        System.out.println(teacher);


        boolean isEligibleToDrive = true;
        String driving = isEligibleToDrive ? "have DL, Can drive" : "No DL, Can t drive";
        System.out.println(driving);
    }
}
