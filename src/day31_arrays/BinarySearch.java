package day31_arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {33,55,123,400};
        Arrays.binarySearch(nums, 55);
        System.out.println(Arrays.binarySearch(nums, 55)); // 1  -  index of num array
        System.out.println(Arrays.binarySearch(nums, 123));//2
        System.out.println(Arrays.binarySearch(nums, 34)); //-2 se presupune ca ar fi al doilea caracter, doar ca e cu minus in fata
        System.out.println(Arrays.binarySearch(nums, 2)); //-1


        if(Arrays.binarySearch(nums,123) >= 0){ // pt ca 123 return un index care este mai mare decat 0
            System.out.println("123 is present in array");
        }else{
            System.out.println("123 is not in the arrya");
        }

        //-----------------------------------------------------------------------------

        int[] nums1 = {4,12,53};
        int[] nums2 = {4,12,53};

        Arrays.equals(nums1, nums2); //true





    }
}
