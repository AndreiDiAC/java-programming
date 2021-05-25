package $$Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class aleMele {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(11,22,33,44,55));
        System.out.println(nums);


        nums.remove(new Integer(22)); //remove value from the array
        System.out.println(nums);


        ArrayList<String> names = new ArrayList<>(Arrays.asList("Andy","Bart","Carl","Elmo"));

        names.add(names.remove(2));
        System.out.println(names);
        names.set(names.indexOf("Andy"),names.remove(2));
        System.out.println(names);

        ArrayList<String> list = new ArrayList<>();
        list.add("Andy");
        list.add("Bart");
        list.add("Carl");
        list.add("Elmo");
        System.out.println(list); //[Andy, Bart, Carl, Elmo]

        list.add(2,"mj");  //[Andy, Bart, mj, Carl, Elmo]
        list.remove(4); // [Andy, Bart, mj, Carl]
        list.set(3,"Andy");                  //[Andy, Bart, mj, Andy]
        list.remove(list.set(0,"mohamed")); //[mohamed, Bart, mj, Andy]
       //list.remove(Andy)

                                            // [mohamed,Bart, mj]
        System.out.println(list);
        System.out.println(list.set(2,"orice"));

        ArrayList<String> name = new ArrayList<>(Arrays.asList("Andy","Bart","Carl","Elmo"));
//        System.out.println(name);
//
//        System.out.println(name.set(0,"Andrei"));
//        System.out.println(name);
//        name.clear();
//
//        System.out.println(name.remove("Andy"));
//
//        String word = null;
//        System.out.println(word + "something");

        System.out.println(name.remove(0));



    }
}
