package $$interviewTasks;

import java.util.*;
import java.util.stream.Stream;

public class aaa {

    public static void main(String[] args) {
//        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2));
//        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2));
//
//        System.out.println(list1.equals(list2));


            Map<Integer, Integer> map = new HashMap<>();
            map.put(2, 1020);
            map.put(3, 300);
            map.put(1, 100);
            map.put(5, 500);
            map.forEach((k,v)->System.out.println(k+"="+v));
            System.out.println("After Sorting by value");
            Stream<Map.Entry<Integer, Integer>> sorted =
                    map.entrySet().stream()
                            .sorted(Map.Entry.comparingByValue());
            sorted.forEach(System.out::println);


    }
}
