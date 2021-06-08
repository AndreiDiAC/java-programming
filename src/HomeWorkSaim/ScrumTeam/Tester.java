package HomeWorkSaim.ScrumTeam;

public class Tester {
    private String name;
    private String employeeID;
    private String jobTitle;
    private int salary;


    public Tester(String name, String employeeID, String jobTitle, int salary){
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void setName(String name){
        this.name = name;;
    }

    public String getName(){
        return name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Tester {" +
                "name='" + name + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(this.name + " is running a smoke test");
    }

    public void createTicket(){
        System.out.println(this.name + " is creating the name");
    }


}


