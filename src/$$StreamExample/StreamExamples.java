package $$StreamExample;

import java.util.*;
import java.util.stream.Stream;

public class StreamExamples {

    public static void main(String[] args) {
        //create a stream
        Stream<String> stream = Stream.of("a","b","c");

        stream.forEach(System.out::println);

        //create a stream from sources
        Collection<String> collection = Arrays.asList("JAVA","J2EE","Spring","Hibernate","JAVA");
        Stream<String> stream2 = collection.stream();
        stream2.forEach(System.out::println);

        List<Integer> nums = new ArrayList<>(Arrays.asList(12,24,2,5,1));
        Stream<Integer> streamNum = nums.stream();
        streamNum.forEach(System.out::println);

        Set<String> set = new HashSet<>(collection);
        Stream<String> setStream = set.stream();
        setStream.forEach(System.out::println);

        String [] strArray = {"a","b","c"};
        Stream<String> stream5 = Arrays.stream(strArray);
        stream5.forEach(System.out::println);







    }
}
