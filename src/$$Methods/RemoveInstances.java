package $$Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveInstances {
    public static void main(String[] args) {
        System.out.println(removeInst(new ArrayList<Integer>(Arrays.asList(1,1,2,3,1,4)), 1));
    }

    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n){

        for ( int i = 0; i < r.size(); i++){
            if(r.get(i).equals(n)){
                r.remove(n);
                i--;
            }
        }
        return r;

// or       r.removeAll(Collections.singleton(n));
    }
}
