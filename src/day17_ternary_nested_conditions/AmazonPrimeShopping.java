package day17_ternary_nested_conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        int itemPrice = 30;
        boolean isPrimeMember = true;
        if(isPrimeMember){
            System.out.println("Eligible for free 2 day shipping");
        }else{
            if (itemPrice > 25){
                System.out.println("Eligible for free regular shipping");
            }else{
                System.out.println("Not eligible for free shipping. fee is $10");
            }
        }
    }
}
