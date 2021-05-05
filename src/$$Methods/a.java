package $$Methods;


import java.util.ArrayList;
import java.util.Arrays;

public class a {
    public static void main(String[] args) {
        String [] password = {"one", "hi", "hold"};
        ArrayList<String> newPass = new ArrayList<>();

        for( String word : password){
            String stars = "";
            for ( int i = 0; i < word.length();i++){
                stars += '*';
            }
            newPass.add(stars);
        }
        System.out.println(newPass);







        //STRING MANIPULATION
//        String strPass = String.join(" ",password);
//        for(int i = 0; i < strPass.length();i++){
//            if(strPass.charAt(i) != ' '){
//                strPass = strPass.replace(strPass.charAt(i), '*');
//            }
//        }
//        String [] newPassword = strPass.split(" ");
//
//
//
//        System.out.println(Arrays.toString(newPassword));



    }
    public static String stars(String str){
        String stars = "";
        for( int i = 0; i < str.length(); i++){
            stars += "*";
        }
        return stars;
    }

}
