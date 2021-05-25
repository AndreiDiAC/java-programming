package $$Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveALl {
    public static void main(String[] args) {
        System.out.println(removeAllManuallyNewArray(
                new ArrayList<>(Arrays.asList("dog","cat","home","cat","cat","cat","level","hide")),"cat"));
    }

    public static ArrayList<String> removeAllLambda(ArrayList<String> wordList, String targetWord ){

        wordList.removeIf(each -> each.contains(targetWord));
        return wordList;
    }

    public static ArrayList<String> removeAllCollection(ArrayList<String> wordList, String targetWord ){
        wordList.removeAll(Collections.singleton(targetWord));
        return wordList;
    }

    public static ArrayList<String> removeAllManually(ArrayList<String> wordList, String targetWord ){
        for (int i = 0; i < wordList.size(); i++){
            if(wordList.get(i).equals(targetWord)){
                wordList.remove(wordList.get(i--));
            }
        }
        return wordList;
    }

    public static ArrayList<String> removeAllManuallyNewArray(ArrayList<String> wordList, String targetWord ){
        ArrayList<String> output = new ArrayList<>();
        for(String each : wordList){
            if(!each.equals(targetWord)){
                output.add(each);
            }
        }
        return output;
    }






}

