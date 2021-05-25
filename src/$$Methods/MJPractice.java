package $$Methods;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MJPractice {
    public static void main(String[] args) {





        List<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4));
        num.addAll(Arrays.asList(11,22,33));
        List<Integer> num2 = new ArrayList<>(Arrays.asList(5,6,7,8));
        num.addAll(num2);
        System.out.println("List " + num);
        System.out.println(num.get(0));
        System.out.println(num.remove(0));
        System.out.println(num);
        System.out.println(num);
        System.out.println(num.remove("2"));
        System.out.println(num.remove(2));

        List<String> str = new ArrayList<>(Arrays.asList("apple","banana","kiwi"));
        str.remove("apple");
        System.out.println(str);

        num.remove(new Integer(2));
        System.out.println(num);

        List<String> words2 = new ArrayList<>(Arrays.asList("mj" , "mohammad" , "javad" , "semati"));
        str.removeAll(str);
        System.out.println(str);
        System.out.println(num.contains(8));

        System.out.println(words2);
        words2.set(0,"orange");
        System.out.println(words2);
        words2.set(words2.indexOf("mohammad"),"banana");
        System.out.println(words2);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(100 , -8 , -2 , 9, 3, 23));

        Collections.addAll(numbers , 1, 2, 3, 4);
        System.out.println("numbers = " + numbers);

        String [] a = {"123" , "456", "789"};
        String [] b = {"abc" , "defg" , "hijk"};
        String [] c = {"@" , "$" , "#"};

        ArrayList<String[]> abc = new ArrayList<>(Arrays.asList(a, b, c));
        System.out.println(abc.get(0)[1].substring(1));
        System.out.println(Arrays.deepToString(abc.toArray()));

        ArrayList<String[]> newABC = new ArrayList<>(); // [a , b , c]
        newABC.add(a);
        newABC.add(b);
        newABC.add(c);
        System.out.println(Arrays.deepToString(newABC.toArray()));
    }

}
