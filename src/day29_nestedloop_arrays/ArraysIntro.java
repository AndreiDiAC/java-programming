package day29_nestedloop_arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {


        String[] cities = {"Los Angeles","Boston","Chicago"};
        System.out.println(Arrays.toString(cities));

        int num; //single variable
        int[] nums = new int[3]; //array variable\
        System.out.println(Arrays.toString(nums));
        nums[0] = 15;
        nums[1] = 10;
        nums[2] = 7;
        System.out.println(nums[0] + " - value of index 0"); //15
        System.out.println(Arrays.toString(nums)); //    [15,10,7]

    //DECLARE AND SPECIFY THE SIZE, THEN ASSIGN VALUE
        int i = 0; //15
        System.out.println(nums[i]); //15
        i++;
        System.out.println(nums[i]); //10

        //how ti find out the size of the array
        System.out.println("number of elements = " + nums.length);

        //store length of array into len variable
        int len = nums.length;
        System.out.println(len); //3

        // reassign
        nums[0] = 100;
        System.out.println();
        nums[1] = 300;
        nums[2] = nums[1];
        System.out.println(Arrays.toString(nums));// [100, 300, 300]


//--------------------------------------------------------------------------------------

        //   2) DECLARE AND ASSIGN VALUE IN THE SAME STATEMENT

        int[] num2 = {234, 12, 343, 545, 234, 222, 99};

        System.out.println(num2.length);  //7
        System.out.println(num2[0]);    //234

//--------------------------------------------------------------------------
        //     3) DECLARE AND ASSIGN VALUE IN THE SAME STATEMENT

        double[] prices = new double[]{10.3, 44.0, 23.99};
        int[] num3 = new int[] {232, 4, 33, 654, 34};




    }
}
