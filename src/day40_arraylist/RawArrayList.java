package day40_arraylist;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


public class RawArrayList {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(); // polymorphic way, by default with 10 null data
        List list2 = new ArrayList();
        System.out.println(list1);
        System.out.println(list2);

        list1.add("java");
        list1.add("apple");
        list1.add("coffee");
        list1.add(1234);
        list1.add(12.2);
        list1.add(true);
        list1.add('c');

        System.out.println(list1);
        System.out.println(list1.size());
    }
}
