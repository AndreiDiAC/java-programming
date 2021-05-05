package AleMele_month$$.orice;

public class MultiArrays {
    public static void main(String[] args) {
        int[][] data = { {12, 5 , 4},{23, 113, 32}};

//        for (int i = 0; i < data.length; i++){
//            System.out.println(i);
//
//            for (int j = 0; j < data[i].length; i++){
//                System.out.println(data[i][j] + " ");
//            }
//            System.out.println();
//        }

        for(int[] row : data){
            System.out.println(row);
        }
    }
}
