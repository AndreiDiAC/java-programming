package day32_arrays_split;

public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        //find and print details of most expensive item
        //find and print details of least expensive item

        System.out.println("----- Most expansive item ----");
        double max = prices[0];
        int indexOfMaxPrice = 0;
        double less = prices[0];
        int indexOfLessPrice = 0;
        for( int i = 0; i < items.length; i++){
            if(prices[i] > max){
                max = prices[i];
                indexOfMaxPrice = i;
            }
            if(prices[i] < less){
                less = prices[i];
                indexOfLessPrice = i;
            }
        }
        System.out.println(items[indexOfMaxPrice] + " - $" + max + " - #" + itemIDs[indexOfMaxPrice]);
        System.out.println();

        System.out.println(" ---- Less expensive item -----");
        System.out.println(items[indexOfLessPrice] + " - $" + less + " - #" + itemIDs[indexOfLessPrice]);
    }
}
