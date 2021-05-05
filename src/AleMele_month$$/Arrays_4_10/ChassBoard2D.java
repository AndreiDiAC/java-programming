package AleMele_month$$.Arrays_4_10;

import java.util.Arrays;

public class ChassBoard2D {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];

        for (int i = 0, num = 1; i < chessBoard.length; i++, num++){
            for (char j = 0, c = 'a'; j < chessBoard[i].length;j++,c++){
                chessBoard[i][j] = num + "" + c;
            }
        }
        System.out.println(Arrays.deepToString(chessBoard));
    }
}
