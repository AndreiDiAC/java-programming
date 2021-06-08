package HomeWorkSaim.ScrumTeam;

public class Developer {
    private String name;
    private String employeeID;
    private String jobTitle;
    private int salary;
    private boolean hasCodingSkills;

    public Developer(String name, String employeeID, String jobTitle, int salary, boolean hasCodingSkills){
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasCodingSkills = hasCodingSkills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean isHasCodingSkills() {
        return hasCodingSkills;
    }

    public void setHasCodingSkills(boolean hasCodingSkills) {
        this.hasCodingSkills = hasCodingSkills;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasCodingSkills=" + hasCodingSkills +
                '}';
    }

    public void coding(){
        System.out.println(this.name + " is coding");
    }

    public void fixingBug(){
        System.out.println(this.name + " is fixing a bug");
    }
}
