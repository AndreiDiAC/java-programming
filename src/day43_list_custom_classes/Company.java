package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Andrei";
        employee.jobTitle = "SDET";
        employee.work();

        Employee employee1 = new Employee();
        employee1.name = "Igor";
        employee1.jobTitle = "developer";
        employee1.work();

        Employee employee2 = new Employee();
        employee2.name = "Ada";
        employee2.jobTitle = "manual tester";
        employee2.work();
    }
}
