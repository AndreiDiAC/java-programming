package $$StreamExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class CountMinMax {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);

        System.out.println(stream.count());

        Integer integer = Stream.of(1,2,3,4,5,6,7,8,9).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("min = " + integer);

//        Integer max = Stream.of(1,2,3,4,5,6,7,8,9).map(Comparator.comparing(Integer :: valueOf)).get();
//        System.out.println("max = " + max);


        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,54,1,23));


    }
}
