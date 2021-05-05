package day32_arrays_split;

public class ShoppingItem {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        System.out.println("----- FIND THE INDEX OF 'GLOVES' IN ITEM ARRAY ------");

        for( int i = 0; i < items.length; i++){
            if(items[i].equals("Gloves")){
                System.out.println("index is " + i + " for gloves.");
                break;
            }
        }
        System.out.println("---- Set boolean to true if item first 'iPad' is found ");
        boolean iPadExisted = false;
        for( int i = 0; i < items.length;i++){
            if(items[i].equals("iPad")){
                iPadExisted = true;
                break;
            }
        }
        System.out.println("iPadExisted = " + iPadExisted);
        System.out.println();


        System.out.println("------ Print a report of each shopping item ------");
        /**
         Shoe - $99.99 - #12345
         Jacket - $150.0 - #12346
         etc
         */

        for(int i = 0; i < items.length; i++){
            System.out.println(items[i] + "\t\t - $" + prices[i] + " \t\t- #" + itemIDs[i]);
        }

        System.out.println();
        System.out.println("------- Look for 'Jacket' in items and print all details-----");

        for(int i = 0; i < items.length;i++){
            if(items[i].equalsIgnoreCase("jacket")){
                System.out.println(items[i] + " - $" + prices[i] + " - # " + itemIDs[i]);
                break;
            }
        }

    }
}
