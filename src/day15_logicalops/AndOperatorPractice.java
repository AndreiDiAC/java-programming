package day15_logicalops;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping  = true;
        String itemName = "Banana";
        if (onSale && freeShipping && itemName.equals("Banana")){
            System.out.println(itemName + " add in basket");
        }else{
            System.out.println("Continue sopping!");

            //add to cart only when it is freeShipping, onSale and itemName = Banana
            //location, salary, remote, benefits
        }
    }
}
