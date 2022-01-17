package $OOP.$Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class FirstClassCollections {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(12,3,5,7,2,55,799));

        Iterator<Integer> a = nums.iterator();

        while (a.hasNext()){
            Integer each = a.next();
            System.out.print (each + " ");

            if(each > 10){
                a.remove();
            }

        }
        System.out.println();
        System.out.println(nums);
        System.out.println(a.hasNext());



    }
}
