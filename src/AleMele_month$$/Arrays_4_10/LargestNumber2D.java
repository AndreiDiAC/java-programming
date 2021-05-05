package AleMele_month$$.Arrays_4_10;
/**
 Given a 8x8 two-dimensional array of strings named chessboard.
 Initialize values inside an array accordingly to the chess board.
 So first element in the array, chessboard[0] should have a value "1a",
 and last element in the array, chessboard[7] should have a value "8h".
 */

public class LargestNumber2D {
    public static void main(String[] args) {
//todo scanner on this one


        int[][] arr = {{1,6},{10,4,5}};

        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);


    }
}
