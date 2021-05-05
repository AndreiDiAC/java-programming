package day40_arraylist;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList);
        System.out.println("isEmpty? = " + shoppingList.isEmpty());
        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");
        }else{
            System.out.println("List in not empty,code java then go to mall");
        }

        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("java book");


        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");
        }else{
            System.out.println("List in not empty,code java then go to mall");
        }

        int count = shoppingList.size();
        System.out.println("Items to buy = " + count);

        System.out.println("is shoes in my list? " + shoppingList.contains("Shoes") );
        if(shoppingList.contains("shoes")){
            System.out.println("Shoes is in the list");
        }else{
            System.out.println("Shoes in not in the list");
        }
        shoppingList.remove("shoes");
        System.out.println(shoppingList);

        System.out.println(shoppingList.remove("mask"));
        System.out.println(shoppingList);

        System.out.println("Done shopping,get back coding");
        shoppingList.clear();
        System.out.println(shoppingList);
    }
}
