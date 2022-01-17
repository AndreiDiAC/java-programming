package day51_inheritance.Employee;

public class Employee extends Object{
    String jobTitle;

    public double calculateSalary(double hourlyRate){
        return 52 * 40 * hourlyRate * 1.1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
