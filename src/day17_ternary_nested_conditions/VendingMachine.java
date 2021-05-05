package day17_ternary_nested_conditions;

public class VendingMachine {
    public static void main(String[] args) {
        String selection = "drink";
        String drink  = "tea";
        String snack = "chips";
//        if(selection.equals("drink")){
//            if(drink.equals("tea")){
//                System.out.println("tea is selected");
//            }else if(drink.equals("coke")) {
//                System.out.println("coke is selected");
//            }
//        }else if(selection.equals("snack")){
//            if(snack.equals("chips")){
//                System.out.println("chips is selected");
//            }else if(snack.equals("candy")){
//                System.out.println("candy is selected");
//            }
//        }


        switch(selection){
            case "drink":
                switch (drink) {
                    case "tea":
                        System.out.println("tea is selected");
                        break;
                    case "coke":
                        System.out.println("coke is selected");
                        break;
                }
                break;
            case "snack":
                switch (snack){
                case "chips":
                    System.out.println("chips is selected");
                    break;
                case "candy":
                    System.out.println("candy is selected");
                    break;
                }
                break;
        }

    }
}
