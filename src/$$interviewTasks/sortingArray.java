package $$interviewTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sortingArray {

    public static void main(String[] args) {


        int [] arr = {12,453,245,1,2,34};
        int [] arr2 = {12,453,245,1,2,34};

        Arrays.sort(arr);

        SortingArrayAsc(new int[]{11,2,35,1,22,512});


    }


    public static void SortingArrayAsc(int[] arr) {

        ArrayList<Integer> list = new ArrayList();

        for (int each : arr) {

            list.add(each);

        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("i = " + i  + "" + list);

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) < list.get(j)) {

                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);

                    System.out.println("j = " + j + " " + list);

                }

            }

        }

        for (int i = 0; i < list.size(); i++) {

            arr[i] = list.get(i);

        }

        System.out.println(list);
    }
}
