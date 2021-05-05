package day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args) {
        String title = "Java SDET";
        String company = "MyCompany";
        String jobDescription = "Java, Selenium, Cucumber, Tomato, JUnit";
        int salary = 100000;
        byte yearsExp = 5;
        boolean hasBenefits = true;

        System.out.println("Job title is: " + title);
        System.out.println("Company name: " + company);
        System.out.println("JobDescription: " +  jobDescription);
        System.out.println("Salary $" + salary);
        System.out.println("Years Exp: " + yearsExp);
        System.out.println("Has Benefits: " + hasBenefits);
    }
}
