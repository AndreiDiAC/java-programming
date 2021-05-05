package AleMele_month$$.Arrays_4_10;

import java.util.Arrays;
import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
                System.out.println(arr[i][j]);
            }//end for cols
            System.out.println();
        }//end for rows

        System.out.println(Arrays.toString(arr));
    }
}
