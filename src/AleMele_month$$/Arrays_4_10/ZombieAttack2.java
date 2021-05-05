package AleMele_month$$.Arrays_4_10;

import java.util.Arrays;

public class ZombieAttack2 {
    public static void main(String[] args) {
        int[] arr = {3, 6, 0, 4, 3, 2, 7, 0};

        int[] temp = new int[arr.length];
        int day = 0;

        System.out.println("Day " + day + " " +Arrays.toString(arr));
        while(!Arrays.equals(arr,temp)){
//
            for (int i = 0; i < arr.length; i++) {
                if (i != 0 && i != arr.length - 1 && arr[i] == 0) {
                    arr[i + 1] /= 2;
                    arr[i - 1] /= 2;
                    if(i+1 == arr[0]){
                        i++;
                    }
                } else if (i == 0 && arr[i] == 0) {
                    arr[i] /= 2;
                } else if (i == arr.length - 1 && arr[i] == 0) {
                    arr[i] /= 2;
                }

            }
            if (arr[0] == 0 && arr[2] != 0) {
                arr[1] /= 2;

            }
            if (arr[arr.length - 1] == 0 && arr[arr.length - 3] != 0) {
                arr[arr.length - 2] /= 2;
            }
            day++;

            System.out.println("Day " + day + " " +Arrays.toString(arr));

        }
        System.out.println("---- EXTINCT ----");
    }
}































// while (!arr.equals(temp)) {
//        int[] temp = new int[arr.length];
//        while(arr != new int[8]){
//
//            for(int i = 0; i < arr.length;i++ ){
//                if(arr[i]==0){
//                    temp[i] = arr[i+1];
//                }
//            }
//        }
//
//        while(arr != new int[8]){
//            if (arr[0] == 0) || arr[0]  {
//
//                arr[1] /=2;
//            }
//            if(arr.length-1==0){
//                arr[arr.length-2] /=2;
//            }
//            for(int i = 0; i < arr.length;i++ ){
//                if(arr[i]==0){
//                    temp[i] = arr[i+1];
//                }
//        }
//


//0 <= arr[i]