package AleMele_month$$$.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>(Arrays.asList("apples","tree","loop","cat","animal","shortcut"));
        System.out.println(str);
        ArrayList<String> result = new ArrayList<>();
        for(String each: str){
            if(each.length() <= 4){
                result.add(each);
            }
        }
        System.out.println(result);
    }
}
