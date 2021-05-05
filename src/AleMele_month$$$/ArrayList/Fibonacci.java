package AleMele_month$$$.ArrayList;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
    fibonacci(20);
    }

    public static void fibonacci(int index){
        int [] arr = new int[index+1];
        arr[1] = 1;
        for( int i = 2; i < arr.length; i++){
            arr[i] = arr[i-2] + arr[i-1];
        }
        System.out.println(Arrays.toString(arr));
    }


}
