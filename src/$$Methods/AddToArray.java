package $$Methods;
import java.util.*;
import java.util.Arrays;

public class AddToArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(), n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ; i <=size-1; i++){
            arr[i]=inp.nextInt();
        }

        add_to_r(arr,n);
    }

    public static void add_to_r(int[] r, int n){
        int [] r2 = new int[r.length + 1];

        for ( int i =0; i < r.length;i++){
            r2[i] = r[i];
        }
        r2[r2.length-1] = n;
        System.out.println(Arrays.toString(r2));

    }

}
