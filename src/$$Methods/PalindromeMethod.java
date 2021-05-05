package $$Methods;
import java.util.*;
public class PalindromeMethod {
    public static boolean isPalindrome(String check) {

        boolean isPalindrom = true;
        check = check.replace(" ","");
        for ( int i = 0 ; i < check.length()/2; i++){
            if(check.toLowerCase().charAt(i) != check.toLowerCase().charAt(check.length()-1-i)){
                isPalindrom = false;
            }
        }
        return isPalindrom;




    }


    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isPalindrome(in.nextLine()));
    }
}
