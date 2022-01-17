package OfficeHours.Practice_04_14;

public class SecondBiggestNumberSaim {
    public static void main(String[] args) {
        int [] nums = {4,3,5,4,5,9,4,8,5,8};
        int max = nums[0];        // 8
        int secondMax = nums[0];  // 7

        for(int eachNum : nums) {

            if(eachNum > max){    // each 4
                secondMax = max;  //second 5
                max = eachNum;    //max 9
            }

            if(eachNum > secondMax && eachNum < max){
                secondMax = eachNum;
            }

        }

        System.out.println("max: " + max);
        System.out.println("2nd max: " + secondMax);

    }
}
