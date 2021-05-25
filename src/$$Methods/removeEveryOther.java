package $$Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class removeEveryOther {
    public static void main(String[] args) {
        System.out.println(removeEveryOther(new ArrayList<>(Arrays.asList("hi","yo","sup","yolo","book"))));
    }

    public static ArrayList<String> removeEveryOther(ArrayList<String> words){

        for(int i = 0; i < words.size(); i++){
            words.remove(i);

        }
        return words;
    }
}
