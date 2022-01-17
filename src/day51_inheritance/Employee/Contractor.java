package day51_inheritance.Employee;

public class Contractor extends Employee {

    @Override // 1) lets everyone know that you are overriding this method
              // 2) ensures that this method is being overridden. if not, it shows ERROR

    public double calculateSalary(double hourlyRate){
        return 52 * 40 * hourlyRate;

    }
}
