package $OOP.$Collections.ThreandsExample;

import java.util.*;

public class b {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3,1,4,7,2,3,4,5,1));

        Set<Integer> set = new LinkedHashSet<>();

        for(Integer num : list){
            set.add(num);
                if(num==7){
                    set.add(null);
                }
            }

        System.out.println(set);
        }

}
