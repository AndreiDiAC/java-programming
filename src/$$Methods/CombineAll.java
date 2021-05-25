package $$Methods;

import day41_arraylist.ArraysAsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class CombineAll {
    public static void main(String[] args) {
//        System.out.println(combineAl(new ArrayList<>(Arrays.asList(1,2,3)), new ArrayList<>(Arrays.asList(4,5,6))));
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int size2 = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }
        for(int i=0; i < size2; i++) {
            list2.add(in.nextInt());
        }

        System.out.println(combineAL(list, list2));
    }

    public static ArrayList<Integer> combineAL(ArrayList<Integer> numbersOne, ArrayList<Integer> numbersTwo){
        ArrayList<Integer> output =  new ArrayList<>();

        for(int each: numbersOne){
            output.add(each);
        }

        for(int i = 0, a = numbersOne.size(); i < numbersTwo.size(); i++, a++){
            output.add(a,numbersTwo.get(i));
        }

        return output;
    }

}
