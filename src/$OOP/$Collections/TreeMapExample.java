package $OOP.$Collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {


        //        Collection<Map.Entry<String,Integer>> scoreMap1 = scoreMap.entrySet();

        SortedMap<String,Integer> myMap = new TreeMap<>();
        myMap.put("Andre",21);
        myMap.put("Bogdan",123);
        myMap.put("Paul",64);
        myMap.put("Andreea",1);
        myMap.put("Maria",99);

        System.out.println(myMap);

        System.out.println(myMap.firstKey());
        System.out.println(myMap.lastKey());
        System.out.println(myMap.subMap("Andre","Maria")); // return a map starting from...till... (they are already sorted)

        System.out.println(myMap.headMap("Paul")); //starting from beginning until your parameter

        System.out.println(myMap.tailMap("Maria")); // starting from parameter till the end

        SortedMap<String,Integer> tailView = myMap.tailMap("Andreea");
        System.out.println("tailView = " + tailView);

        tailView.replace("Andreea",11);
        System.out.println(tailView);


    }
}
