package $$Methods;

import java.util.Scanner;

public class MergeThemReturn {
    public static String mergeStrings(String one, String two) {

        String result = "";
        String biggest = "";
        int lastIndexOfLow = 0;
        for (int i = 0, f = 0; i < one.length() && f < two.length();i++,f++){
            result +=""+ one.charAt(i) + two.charAt(f);
            if(i == one.length()-1 || f == two.length()-1){
                lastIndexOfLow = i;
                break;
            }
        }
        biggest = one.length() > two.length() ? one : two;
        for(int i = lastIndexOfLow +1; i < biggest.length();i++){
            result += biggest.charAt(i);
        }
        return result;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
    }

}

