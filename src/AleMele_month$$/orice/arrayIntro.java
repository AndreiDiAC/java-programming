package AleMele_month$$.orice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrayIntro {
    public static void main(String[] args) {
         int[] arrayVar = {1,4,3};
        System.out.println(arrayVar[0]);

        String[] names = {"Jhon", "Adam","Don"};
        for(String item: names){
            System.out.println(item);
        }

        int[] target = {11,4, 5};

        Arrays.sort(target);
        System.out.println(target);
        System.out.println(Arrays.toString(target));


    }
}
