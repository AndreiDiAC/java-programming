package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "rainy";
        if (weather.equals("sunny")){
            System.out.println("Go to park!\nGo hiking!\nCode java!");
        }else if(weather.equals("rainy")){
            System.out.println("Stay home, drink tea and code java");
        }else if(weather.equals("snowy")){
            System.out.println("Clear the car then build snow man.\nDrink hot chocolate and code java");
        }else if(weather.equals("windy")){
            System.out.println("Get ready for power loss, fly a kite and code java");
        }else{
            System.out.println("Just keep coding java");
        }
    }
}
