package day38_methods;
import static day38_methods.ArraysUtils.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysUtilsTest {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int [] n = new int[s.nextInt()];
//        for( int i = 0; i < n.length; i++){
//            n[i] = s.nextInt();
//        }


        int [] nums = {5,23,1,543,90};
        ArraysUtils.printArray(nums);
        ArraysUtils.printArray(new int[]{21,12,5,3,66,76,88,22});
        System.out.println(sum(new int[]{1,2,3,4,5}));
        int [] sumArr = {1,2,3,4,5};
        System.out.println(sum(sumArr));

        System.out.println(contains(new int[]{1,2,3,4,5}, 5));


    }
}
