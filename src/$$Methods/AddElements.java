package $$Methods;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(addElements(new int[] {10,40,50,3,1},new int[] {11,0,500,44,1101})));
    }

    public static int [] addElements(int [] ints1, int [] ints2){
        int [] output = new int[5];

        for (int i = 0; i < 5; i++){
            output[i] = ints1[i] + ints2[i];
        }
        return output;
    }
}
