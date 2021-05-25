package $$Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class GetDuplicate {
    public static void main(String[] args) {
        System.out.println(getDup(new String[]{"8","1","g","aabb","7","7","2","aa","7"}));
    }

    public static int getDup(String [] r) {
        ArrayList<String> arr = new ArrayList<>();
        for (String s : r) {
            int count = 0;
            for (String s1 : r) {
                if(s.equals(s1)){
                    count++;
                }
            }
            if(count == 1){
                arr.add(s);
            }
        }

        return r.length - arr.size();
    }
}
