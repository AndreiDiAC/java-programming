package day13_conditional_statements2;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Iasi";
        if ( city.equals("Iasi")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        String weather = "sunny";
        if (!weather.equals("sunny")){
            System.out.println("Is sunny");
        }else{
            System.out.println("Is not sunny");
        }
    }
}
