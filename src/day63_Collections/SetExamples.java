package day63_Collections;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        // list -> ArrayList
        set.add(100);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);

        System.out.println(set);


        Set<String> words = new HashSet<>();
        words.add("hello");
        words.add("world");
        words.add("java");
        words.add("java");
        words.add("collections");

        words.remove("world");

        System.out.println(words);

        // convert your Set to a List

        List<String> wordsLList = new ArrayList<>(words);
        wordsLList.add("world");
        System.out.println(wordsLList);



        Set<String> linkedHasSet = new LinkedHashSet<>();
        linkedHasSet.add("24");
        linkedHasSet.add("java");
        linkedHasSet.add("$#");
        linkedHasSet.add("53");
        linkedHasSet.add("java");
        linkedHasSet.add("apple");
        linkedHasSet.add("cucumber");
        linkedHasSet.add("53");

        System.out.println(linkedHasSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("24");
        treeSet.add("java");
        treeSet.add("$#");
        treeSet.add("53");
        treeSet.add("java");
        treeSet.add("apple");
        treeSet.add("cucumber");
        treeSet.add("53");

        System.out.println(treeSet);
//        ((TreeSet)treeSet).first();



    }

}
