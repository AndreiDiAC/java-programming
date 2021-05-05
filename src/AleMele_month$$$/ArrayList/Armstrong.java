package AleMele_month$$$.ArrayList;

import java.util.ArrayList;

public class Armstrong {
    public static boolean isArmstrong(int num){
        int sameNum = num;
        int sum = 0;
        ArrayList<Integer> arrNums = new ArrayList<>();

        while(sameNum != 0){
            arrNums.add(sameNum % 10);
            sameNum /=10;
        }

        for(int each: arrNums){
            sum += Math.pow(each,arrNums.size());
        }
        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}
