package $OOP.$Collections;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        Map<String, Integer> scoreMap = new HashMap<>();

        scoreMap.put("Adam",90);
        scoreMap.put("John",92);
        scoreMap.put("Mary",100);

        System.out.println(scoreMap);

        System.out.println("soreMap.get(\"Adam\") = " + scoreMap.get("Adam"));
        System.out.println("soreMap.get(92) = " + scoreMap.get(92));

        for(Map.Entry<String,Integer> each: scoreMap.entrySet()){
            System.out.println(each.getKey() + each.getValue());
        }

        for(Integer each: scoreMap.values()){
            System.out.println(each);
        }

        System.out.println(scoreMap.remove("Adam"));

        System.out.println(scoreMap);

        System.out.println("scoreMap.putIfAbsent(\"Mary\",199) = " + scoreMap.putIfAbsent("Mary2", 199));
        System.out.println(scoreMap);

        System.out.println("scoreMap.getOrDefault(\"Alex\",60) = " + scoreMap.getOrDefault("Alex", 60));
        System.out.println(scoreMap);

        System.out.println("scoreMap.replace(\"Mary2\", 200) = " + scoreMap.replace("Mary2", 200));
        System.out.println(scoreMap);

        System.out.println("scoreMap.replace(\"Mary\",200,90) = " + scoreMap.replace("Mary2", 200, 90));
        System.out.println(scoreMap);

        //-------------------------------------------------------------------------------------

        Set<String> key = scoreMap.keySet();
        System.out.println();
        System.out.println(key);
        key.remove("John");
        System.out.println(key);


        Collection<Integer> allScores = scoreMap.values();
        System.out.println(allScores);

        Set<Map.Entry<String,Integer>> allEntries = scoreMap.entrySet();

        System.out.println();
        for(Map.Entry<String, Integer> eachEntry : allEntries){
            System.out.println(eachEntry);
            System.out.println(eachEntry.getKey());
            System.out.println(eachEntry.getValue());

            if(eachEntry.getValue() > 80){
                eachEntry.setValue(95);
            }
        }

        System.out.println("scoreMap after update = " + scoreMap);



        //-----------------------------------------------------------



        





    }
}
