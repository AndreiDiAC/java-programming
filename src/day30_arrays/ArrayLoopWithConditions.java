package day30_arrays;

import java.util.Arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Brazil", "Portugal",
                "China", "Philippines", "Philippines", "China", "Philippines", "China", "Armenia", "Philippines", "China",
                "Colombia", "Philippines", "Honduras", "Indonesia", "Brazil", "China", "United States", "Russia"};
        for(double eachPrice : prices){
            if(eachPrice > 100){
                System.out.print(eachPrice + " ");
            }

        }
        System.out.println();
        System.out.println(Arrays.toString(prices));


        for(double eachPrice : prices){
            if(eachPrice >= 10 && eachPrice <= 70){
                System.out.print(eachPrice + " ");
            }
        }
        System.out.println();
        int count = 0;
        for(double i : prices){
            if(i > 50){
                count++;
            }
        }
        System.out.println(count); // 7



        for(String eachStr : countries){
            if(eachStr.length() >=7){
                System.out.print(eachStr + ", ");
            }
        }

    }
}
