package $$Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class DeliveryCalc {
    public static void main(String[] args) {
        System.out.println(refuel_times(new ArrayList<>(Arrays.asList(9,1)), 3));
        System.out.println(1/3);
    }

    public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel){
        int count = 0;
        for ( int i = 0; i < deliveries.size(); i++){
            if(deliveries.get(i) < max_fuel){
                count++;
            }
            count += deliveries.get(i) / max_fuel;
        }
        return count;
    }
}
