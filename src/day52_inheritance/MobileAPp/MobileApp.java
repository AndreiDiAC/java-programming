package day52_inheritance.MobileAPp;

public class MobileApp {
    private String name;
    double version;

    protected boolean download(){
        System.out.println("App: " + name + " version: " + version + " is downloaded");
        return true;
    }


    public void useTheApp(int minutes){
        System.out.println("Using the " + name + " app for " + minutes + " minutes!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }
}
