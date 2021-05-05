package AleMele_month$$.Arrays_4_10;

import java.util.Arrays;

public class PrintShorterWord {
    public static void main(String[] args) {
        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";

        String strArr[] = str.split(", ");
        Arrays.sort(strArr);
        String min = strArr[0];
        for(String each: strArr){
            if(each.length() < min.length()){
                min = each;
            }
        }
        String minWords = "";
        for(String each:strArr){
            if(each.length() == min.length()){
                minWords += each + " ";
            }
        }

        System.out.println(Arrays.toString(minWords.split(" ")));




        //or

//        String[] strArr = str.split(", ");
//            String shortest = "";
//            int count = strArr[0].length();
//            for (int i = 0; i < strArr.length; i++){
//                if (count == strArr[i].length()) {
//                    shortest += " " + strArr[i];}
//                else if(count > strArr[i].length()) {
//                    shortest = strArr[i];
//                    count = strArr[i].length();}
//
//            }
//            String[] shortestArr = shortest.trim().split(" ");
//            Arrays.sort(shortestArr);
//            System.out.print(Arrays.toString(shortestArr));

    }
}
