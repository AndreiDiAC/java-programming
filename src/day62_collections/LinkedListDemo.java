package day62_collections;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> friends = new LinkedList<>();
      // reference type
        List<Integer> scores = new LinkedList<>();

        scores.add(5);
        scores.add(42);
        scores.add(23);
        scores.add(42);
        System.out.println(scores);
        System.out.println("index 0 = " + scores.get(0));
        System.out.println("index 1 = " + scores.get(1));

        friends.add("Andrei");
        friends.add("Andreea");
        friends.add("Abbas");
        friends.addFirst("John");
        System.out.println(friends);






    }
}
