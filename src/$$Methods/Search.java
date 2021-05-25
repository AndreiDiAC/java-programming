package $$Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        System.out.println(search(new ArrayList<>(Arrays.asList("one apple","two orange","four banana")),"four"));
    }

    public static String search(ArrayList<String> r,String find){
        String result = "";
        for ( String elem : r){
            if(elem.contains(find)){
                result = elem;
            }else{
                result = "search failed";
            }
        }
        return result;
    }
}
