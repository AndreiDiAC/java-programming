package day41_arraylist;

import java.util.ArrayList;

public class Cities {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Washington Dc");
        cities.add("New York");
        cities.add("Vienna");
        cities.add("Adana");
        cities.add("LA");
        cities.add(0,"Ashgabat");
        System.out.println(cities);
        System.out.println("fist city = " + cities.get(0));
        System.out.println("last city = " + cities.get(cities.size()-1));
        System.out.println("count of items = " + cities.size());


        int size = cities.size();
        System.out.println("there are " + size + " cities in the list");

        for (int i = 0; i < cities.size();i++){
            System.out.print(cities.get(i) + " ");
        }
        System.out.println();

        for(String each: cities){
            System.out.print(each + " ");
        }

        System.out.println();
        cities.remove("Vienna");
        cities.remove(2);
        System.out.println(cities);

        cities.clear();
        System.out.println(cities);

        if(cities.isEmpty()){
            System.out.println("list is empty");
        }

        if(cities.size() == 0){
            System.out.println("list is empty");
        }


    }

}
