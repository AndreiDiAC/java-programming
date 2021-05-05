package day42_arraylist;

import java.util.*;

public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j','a','v','a','i','s','f','u','n'));
        System.out.println("size = " + letters.size());
        System.out.println(letters);
// reverse with Collections
        Collections.reverse(letters);
        System.out.println(letters);
        //Unic charcarter / return int
        System.out.println(Collections.frequency(letters,'a'));

        int vCount = Collections.frequency(letters,'v');
        System.out.println("vCount = " + vCount);

        System.out.println("Max char = " + Collections.max(letters));
        System.out.println("Min char = " + Collections.min(letters));

        Collections.reverse(letters);
        Collections.replaceAll(letters,'a','u');
        System.out.println("after replaceAll = " + letters);
        System.out.println(Collections.replaceAll(letters,'a','u'));

        Collections.sort(letters);
        System.out.println("After sort = " + letters);

        List<Integer> nums = Arrays.asList(23,1,43,5,234,7,-9,0,1,5,5,5,5);
        Collections.reverse(nums);

        System.out.println("reverse nums = " + nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("how many 5 in nums? - " + Collections.frequency(nums, 5));

        Collections.replaceAll(nums, 5, 50);
        System.out.println(nums);

        Collections.sort(nums,Collections.reverseOrder());
        System.out.println("after reverse sort = " + nums);




    }
}
