package OfficeHours.Practice_08_03;

import java.util.*;

public class CollectionFramework {

    public static void main(String[] args) {


        Collection<String> list1 = new ArrayList<>();

        List<String> list2 = new ArrayList<>();

        ArrayList<String> list3 = new ArrayList<>();

        list2.add("John");
        list2.add("Stephan");
        list2.add("Irina");

        List<String> list4 = new Stack<>();

        list4.add("John");
        list4.add("Stephan");
        list4.add("Irina");

//        list3 = new LinkedList<>();  Error

        String str1 = ((Stack<String>) list4).pop();

        System.out.println(str1);

        System.out.println("===============================================");

        List<Integer> list5 = new Stack<>();
        list5.addAll(Arrays.asList(45,105,2910,459,290,759));
        Collections.sort(list5);
        System.out.println(list5);


        for (int i = 0; i < list5.size();) {
            int x = ((Stack<Integer>) list5).pop();
            System.out.println(x);

        }

















    }
}
