package $OOP.$Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacterFromString {

    public static void main(String[] args) {

        String str = "accabbcd";

        Map<Character, Integer> unique = new HashMap<>();


        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }

                unique.put(str.charAt(i),count);

        }

        System.out.println(unique);

        FrequencyTest("accabbcd");

    }

    public static void FrequencyTest(String  str ) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character each : str.toCharArray()) {

            if (map.containsKey(each)) {

                map.put(each, map.get(each) + 1);

            } else {

                map.put(each, 1);

            }

        }

        System.out.println(map);

    }
}
