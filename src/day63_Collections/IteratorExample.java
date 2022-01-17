package day63_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("john");
        list.add("jamie");
        list.add("jorege");

        Iterator<String> it = list.iterator();

        Set<String> name = new HashSet<>();
        name.add("james");
        name.add("kinga");
        name.add("mj");
        name.add("john");
        name.add("parvin");

        Iterator<String> iterator = name.iterator();

        while (iterator.hasNext()){
            String currentName = iterator.next();
            System.out.println(currentName);

            if(currentName.length() < 3 || currentName.startsWith("j")){
                iterator.remove();
            }
        }

        System.out.println(name);

    }
}
