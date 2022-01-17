package $$interviewTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class StringAlphabetic {

    public static void main(String[] args) {
//        List<String> list= new ArrayList<>();
//
//        list.add("Adam");
//        list.add("John");
//        list.add("Mary");
//        list.add("Diana");
//
//        List<String> newList = new ArrayList<>();
//
//
//        for (String each: list) {
//            for( int i = 0 ; i < each.length(); i++){
//                int count = 0;
//                for (int j = 0; j < each.length(); j++) {
//                    if(each.charAt(i) > each.charAt(j)){
//                        count++;
//                    }
//                }
//                if(count == i){
//                    newList.add(each);
//                }
//
//            }
//        }
//
//        System.out.println(newList);



        String str = "asddaughea";

        char [] arr = str.toCharArray();

        Arrays.sort(arr);

        String result = new String(arr);
        System.out.println(result);

//        System.out.println(Arrays.toString(arr)));

    }
}
