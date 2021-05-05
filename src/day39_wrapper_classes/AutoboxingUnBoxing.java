package day39_wrapper_classes;

public class AutoboxingUnBoxing {
    public static void main(String[] args) {
        //auto-boxing -- from primitive to Wrapper
        int num1 = 500;
        Integer num2 = num1;

        //Un-boxing: object -> primitive
        Double d1 = new Double(100.5);
        double d2 = d1;
        double d3 = new Double(345.3);

        Integer n = 300;
    }
}
