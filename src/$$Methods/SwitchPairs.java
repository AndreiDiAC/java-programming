package $$Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class SwitchPairs {
    public static void main(String[] args) {
        System.out.println(switchPairs(new ArrayList<>(Arrays.asList("Cat","in","the","hat"))));
    }

    public static ArrayList<String> switchPairs(ArrayList<String> strings){
        ArrayList<String> output = new ArrayList<>();

        for( int i = 0; i < strings.size(); i+=2){
            output.add(strings.get(i+1));
            output.add(strings.get(i));
        }
        return output;
    }
}
