package $OOP.$Collections;

import java.util.*;

public class FrequencyOfWords {


    public static void main(String[] args) {

        String str = "abcdefge";


        System.out.println(str.substring(1,3));

        String result = str.substring(str.length()/2 -1, str.length()/2 + 1);
        System.out.println(result);
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.substring(1));



    String str2 = "asdss Asdss gfds sfa gsdg s";

    str2 = str2.toLowerCase();


        System.out.println("frequencyWord(str2) = " + frequencyWord(str2));
        System.out.println("frequencyWord2(str2) = " + frequencyWord2(str2));


    }


    public static Map<String,Integer> frequencyWord(String str){   //this is faster
        Map<String, Integer> map = new LinkedHashMap<>();

        List<String> words = new ArrayList<>(Arrays.asList(str.split(" ")));

        for( String eachWord : words){
            if(!map.containsKey(eachWord)){
                map.put(eachWord,1);
            }else{
                map.put(eachWord,map.get(eachWord) + 1);
            }
        }

        return map;
    }


    public static Map<String,Integer> frequencyWord2(String str){
        Map<String, Integer> map = new LinkedHashMap<>();

        String [] arr = str.split(" ");

        List<String> words = new ArrayList<>(Arrays.asList(arr));

        for(String eachWord : words){
            map.put(eachWord,Collections.frequency(words,eachWord));
        }
        return map;
    }

    public void asd(String asd){

    }

    public String asd(String asd, int a){
        return asd;
    }

}
