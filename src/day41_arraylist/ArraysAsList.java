package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("nums = " + nums);
        //nums.add(100);   this is not working because u get an immutable array list
        //for having an mutable array list we need to type it like this

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7));
        System.out.println("nums = " + nums2);
        nums2.add(100);
        System.out.println("nums with add number = " + nums2);
        nums2.remove(0);
        nums2.remove(new Integer(100));    //remove number
        System.out.println(nums2);

        /*
        List String drinksWithCoffeine -> coffe, teo, monster, red bull, coke, pepsi, mdew, kambucha
        int coffeineAmount = 0;
            monster, red bull, celsius:
            coffeineAmount = 150
         */
        System.out.println("------LIST OF DRINKS------");
        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull", "coke", "pepsi",
                "mdew", "kambucha", "celsius"));
        int coffeineAmount = 0;
        for (String drink : drinksWithCaffeine) {
            if (drink.equalsIgnoreCase("monster") || drink.equalsIgnoreCase("red bull") || drink.equalsIgnoreCase("celsius")) {
                coffeineAmount = 150;
                System.out.println(drink + " = " + coffeineAmount);
            } else if (drink.equalsIgnoreCase("coffee") || drink.equalsIgnoreCase("kambucha")) {
                coffeineAmount = 112;
                System.out.println(drink + " = " + coffeineAmount);
            } else if (drink.equalsIgnoreCase("tea") || drink.equalsIgnoreCase("coke") || drink.equalsIgnoreCase("pepsi") ||
                    drink.equalsIgnoreCase("mdew")) {
                System.out.println(drink + " = " + (coffeineAmount = 35));
            }

        }
        System.out.println("----Switch list---");
        for(String each: drinksWithCaffeine){
            switch (each){
                case "monster":
                case "red bull":
                case "celsius":
                    coffeineAmount = 150;
                    System.out.println(each +" = " + coffeineAmount);
                    break;
                case "coffee":
                case "kambucha":
                    coffeineAmount = 112;
                    System.out.println(each +" = " + coffeineAmount);
                    break;
                case "tea":
                case "coke":
                case "papsi":
                case "mdew":
                    coffeineAmount = 35;
                    System.out.println(each +" = " + coffeineAmount);
                    break;
            }
        }
        //METHOD for FOR EACH LOOP
        //short cut for for each loop in ArrayList
        drinksWithCaffeine.forEach(drink -> System.out.println(drink));
        drinksWithCaffeine.forEach(x -> System.out.println(x.toUpperCase()));
        drinksWithCaffeine.forEach(each -> {
            System.out.println("-------");
            System.out.println("each = " + each);
            System.out.println("--------");
        });


        List<Integer> x = Arrays.asList(2,4,5);
        System.out.println(x);

    }
}

