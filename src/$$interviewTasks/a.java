package $$interviewTasks;


import java.util.*;

public class a {

    public static void main(String[] args) {

        //String with duplicate
        //return unique

        //asda => asd

        System.out.println(noDuplicate("asda"));


        Map<String, Integer> asd = new HashMap<>();
        asd.put("asd",1);


        System.out.println(asd);


        System.out.println(xDuplicate3(new ArrayList<>(Arrays.asList("Andreea", "java", "Andreea", "Andrei", "java"))));



    }


    public static String noDuplicate(String str){
        String empty = "";

        if(!str.isEmpty()){
            for (int i = 0; i < str.length(); i++) {
                if(!empty.contains("" + str.charAt(i))){
                    empty +=  str.charAt(i);
                }
            }
        }else{
            System.out.println("this string is empty!");
        }



        return empty;

    }

    // {"a", "b", "c", "a"}

    public static ArrayList<String> xDuplicate(ArrayList<String> list){
        ArrayList<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(Collections.frequency(list,list.get(i)) == 1){
                newList.add(list.get(i));
            }else {
                newList.add(list.get(i) + "x");
            }
        }
        return newList;

    }


    public static ArrayList<String> xDuplicate2(ArrayList<String> list) {
        ArrayList<String> newList = new ArrayList<>();

            for (String s : list) {
                if(Collections.frequency(list,s) == 1){
                    newList.add(s);
                }else {
                    newList.add(s + "x");
                }
            }

        return newList;
    }

    public static ArrayList<String> xDuplicate3(ArrayList<String> list) {
        ArrayList<String> newList = new ArrayList<>();

        for (String s : list) {
            int count =0;
            for (String s1 : list) {
                if(s.equals(s1)){
                    count++;
                }
            }

            if(count == 1){
                newList.add(s);
            }else {
                newList.add(s + "x");
            }

        }
        return newList;
    }




}
