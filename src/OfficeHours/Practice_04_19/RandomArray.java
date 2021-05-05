package OfficeHours.Practice_04_19;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {

    public static int[] getRandomIntArray(int size, int maxRandomNumber){
        Random random = new Random();
        int [] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = random.nextInt(maxRandomNumber+1);
        }
        return arr;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(getRandomIntArray(4,10)));
    }
}
