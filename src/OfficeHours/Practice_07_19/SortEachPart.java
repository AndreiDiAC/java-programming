package OfficeHours.Practice_07_19;

import java.util.Arrays;

public class SortEachPart {
    public static void main(String[] args) {
        String word = "DC501GCCCA098911";
        String result = "";
        int count = 0;
        char[] temp;

        for (int i = 0; i < word.length(); i++) {
            count = 0;
            temp = null;
            if (Character.isLetter(word.charAt(i))) {
                for (int j = i + 1; j < word.length(); j++) {
                    if (Character.isLetter(word.charAt(j))) {
                        count++;
                    } else {
                        break;
                    }
                }
            } else if (Character.isDigit(word.charAt(i))) {
                for (int j = i + 1; j < word.length(); j++) {
                    if (Character.isDigit(word.charAt(j))) {
                        count++;
                    } else {
                        break;
                    }
                }
            }
            temp = word.substring(i, i + count + 1).toCharArray();
            Arrays.sort(temp);
            for (char each : temp) {
                result += each + "";
            }
            i += count;
        }
        System.out.println("result = " + result);
    }


}
