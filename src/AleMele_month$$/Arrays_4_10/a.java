package AleMele_month$$.Arrays_4_10;

public class a {
    public static void main(String[] args) {

        int[] nums = {4, 3, 1, 4, 5, 2, 4, 8, 4, 8};

        int max = nums[0];
        int max2nd = nums[0];
        for(int each: nums){
            if(each > max){
                max2nd = max;
                max = each;
            }
            }
        for(int each: nums){
            if(each < max2nd && max2nd < max ){
                each = max2nd;
            }
        }
        System.out.println("second max " + max2nd);
        System.out.println("max = " + max);


    }
}


