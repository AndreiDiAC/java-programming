package day55_abstraction_interface.WebDriver;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("FirefoxDriver - navigate to " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("FirefoxDriver - locating element by " + locator);
    }

    @Override
    public void quit() {
        System.out.println("FirefoxDriver - quitting the driver");
    }

    @Override
    public String getTitle() {
        return "wooden spoon title";
    }
}
