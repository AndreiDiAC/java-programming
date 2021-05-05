package AleMele_month$$.Arrays_4_10;

/**
 Given a square matrix, calculate the absolute difference between the sums of its diagonals.

 For example, the square matrix is shown below:

 1 2 3
 4 5 6
 9 8 9

 The left-to-right diagonal = 1+5+9 = 15. The right to left diagonal = 3+5+9 = 17.
 Their absolute difference is |15-17| = 2
 */

public class DiagonalDifference2D {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{9,8,9}};
        int sumFirst = 0;
        int sumSecond = 0;

        for (int i = 0, f =matrix[i].length-1; i < matrix.length; i++, f--){
            sumFirst += matrix[i][i];
            sumSecond += matrix[i][f];
        }
        System.out.println(Math.abs(sumFirst-sumSecond));
    }
}
