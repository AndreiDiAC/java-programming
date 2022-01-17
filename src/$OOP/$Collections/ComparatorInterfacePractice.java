package $OOP.$Collections;

import java.util.*;

public class ComparatorInterfacePractice {
    public static void main(String[] args) {

        // how to compare the value of a elem from an object

        List<Person> plst = new ArrayList<>();

        plst.add(new Person("John",23));
        plst.add(new Person("Andrei",3));
        plst.add(new Person("Andreea",233));
        plst.add(new Person("Radu",33));
        plst.add(new Person("Eric",123));

//        Comparator<Person> ageComparator = Comparator.comparing( p -> p.age);
//        Collections.sort(plst, ageComparator);
//        System.out.println(plst);

        //or
//        Comparator<Person> nameComparator = (o1,o2) -> o2 .name.compareTo(o1.name); //reverse order

        Comparator<Person> nameComparator = (o1,o2) -> o1 .name.compareTo(o2.name);
        Collections.sort(plst, nameComparator);
        System.out.println(plst);



































//        Map<String, Integer> myMap = new HashMap<>();
//
//        myMap.put("John",23);
//        myMap.put("Andrei",3);
//        myMap.put("Andreea",233);
//        myMap.put("Radu",33);
//        myMap.put("Eric",123);
//
//        Comparator<Map.Entry<String, Integer>> comparator = Comparator.comparing(p -> p.getValue());
//        Collections.sort(myMap, comparator);

    }




}
