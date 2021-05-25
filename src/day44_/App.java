package day44_;

public class App {
    String name;
    double version;

    public void open(){
        System.out.println(name + " app, version "+  version +" has been launched!");
    }
}

class MyApps{
    public static void main(String[] args) {
        App app1 = new App();
        app1.name = "Waze";
        app1.version = 3.4;
        app1.open();

        App app2 = new App();
        app2.name = "Kahoot";
        app2.version = 2.2;
        app2.open();
    }
}
