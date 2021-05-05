package AleMele_month$$.Arrays_4_10;

import java.util.Arrays;

public class zOM2 {
    public static void main(String[] args) {

        int[] arr = {0, 10, 0, 8, 7, 8, 8, 8};
        int[] arrEmpty = new int[arr.length];
        int[] arrStor = Arrays.copyOf(arr, arr.length);
        int day = 0;

        System.out.println("Day "+day +" " + Arrays.toString(arrStor));

        while (!Arrays.equals(arrStor, arrEmpty)) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == 0 && arr[i + 1] != 0) {
                    arrStor[i + 1] /= 2;
                }
                continue;
            }
            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[i] == 0 && arr[i - 1] != 0) {
                    arrStor[i - 1] /= 2;
                }
                continue;
            }day++;
            arr = Arrays.copyOf(arrStor,arrStor.length);
            System.out.println("Day "+day +" " + Arrays.toString(arrStor));
        }
        System.out.println(" ---- EXTINCT ----");
    }
}
