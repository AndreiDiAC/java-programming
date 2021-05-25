package $$Methods;


import java.util.ArrayList;
import java.util.Arrays;

public class b {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Andy","Bart","Carl","Elmo"));

        names.add(names.remove(2));  //   ["Andy","Bart", "Elmo"]
        System.out.println(names);

        System.out.println(names.remove("Andysdfas"));
        System.out.println(names);




    }

}
