package OfficeHours.Practice_04_06;

public class BiggestSubstring {
    public static void main(String[] args) {


        String str = "aabbccceeee";
        String longestSubstring = "";
        String temp = "";
        str += " ";
        for (int i = 0; i < str.length()-1; i++) {
            temp += str.charAt(i);
            if (str.charAt(i) != str.charAt(i+1)){
                if (temp.length() > longestSubstring.length()){
                    longestSubstring = temp;
                }
                temp = "";
            }
        }
        System.out.println(longestSubstring);


    }
}
