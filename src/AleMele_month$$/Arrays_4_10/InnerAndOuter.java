package AleMele_month$$.Arrays_4_10;
/**
 * Given two arrays of ints sorted in increasing order, outer and inner,
 * print out true if all of the numbers in inner appear in outer.
 * Take advantage of the fact that both arrays are already in sorted order.
 * <p>
 * Examples:
 * <p>
 * input (outer): 1, 2, 4, 6
 * input (inner): 2, 4
 * <p>
 * output: true
 * input (outer): 1, 2, 4, 6
 * input (inner): 2, 4
 * <p>
 * output: true
 * input (outer): 1, 2, 4
 * input (inner): 6, 5
 * <p>
 * output: false
 */

import java.util.*;

public class InnerAndOuter {
    public static void main(String[] args) {

        int[] outer = {1, 2, 4, 6};
        int[] inner = {2, 4};
        Arrays.sort(inner);
        Arrays.sort(outer);


        int count = 0;
        for (int f = 0; f < inner.length; f++) {
            if (Arrays.binarySearch(outer, inner[f]) < 0) {
                count++;
            }
        }
        System.out.println( count >= 1 ? false : true);
    }
}



//  System.out.println(Arrays.toString(outer));
//        System.out.println(Arrays.toString(inner));


//        System.out.println(Arrays.binarySearch(outer, inner[0]));














