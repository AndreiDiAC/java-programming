package $$interviewTasks;

import java.util.ArrayList;

public class password {

    public static void main(String[] args) {
        System.out.println(password("b1asd!"));
    }

    public static boolean password(String password){
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasSpecial = false;
        boolean hasDigit = false;
        boolean hasSpace = true;
        boolean isBigger = true;

        String str = "asd";




            for( int i = 0; i < password.length(); i++){
                if (Character.isUpperCase(password.charAt(i))){
                    hasUpper = true;
                }
                if(Character.isDigit(password.charAt(i))){
                    hasDigit = true;
                }
                if(Character.isLowerCase(password.charAt(i))){
                    hasLower = true;
                }
                if(!Character.isLetterOrDigit(password.charAt(i))){
                    hasSpecial = true;
                }
                if(password.charAt(i) == ' '){
                    hasSpace = false;
                }
            }
        if(password.length() < 6){
            isBigger = false;
        }

        return hasDigit && hasLower && hasSpace && hasSpecial && hasUpper && isBigger;
    }
}



