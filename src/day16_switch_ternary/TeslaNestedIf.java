package day16_switch_ternary;

public class TeslaNestedIf {
    public static void main(String[] args) {
        char model = 'S';
        String trim = "Long Range";

        if (model=='S'){
            if(trim.equals("Long Range")){
                System.out.println("range 412mi");
                System.out.println("top speed 155mph");
                System.out.println("0-60mph - 3.1sec");
            }else if(trim.equals("Plaid")){
                System.out.println("range 390mi");
                System.out.println("top speed 200mph");
                System.out.println("0-60mph - 1.99sec");
            }else if(trim.equals("Plaid+")){
                System.out.println("range 520mi");
                System.out.println("top speed 200mph");
                System.out.println("0-60mph - 1.99sec");
            }
        }else if(model =='3'){
            if(trim.equals("Standard Range Plus")){
                System.out.println("range 263mi");
                System.out.println("top speed 140mph");
                System.out.println("0-60mph - 5.3sec");
            }else if(trim.equals("Long Range")){
                System.out.println("range 353mi");
                System.out.println("top speed 145mph");
                System.out.println("0-60mph - 4.2sec");
            }else if(trim.equals("Performance")){
                System.out.println("range 315mi");
                System.out.println("top speed 162mph");
                System.out.println("0-60mph - 3.1sec");
            }
        }else if(model == 'X'){
            if (trim.equals("Long Range")){
                System.out.println("range 360mi");
                System.out.println("top speed 155mph");
                System.out.println("0-60mph - 3.8sec");
            }else if(trim.equals("Plaid")){
                System.out.println("range 340mi");
                System.out.println("top speed 163mph");
                System.out.println("0-60mph - 2.5sec");
            }
        }
    }
}
