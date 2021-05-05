package day38_methods;

public class isPalindromeClass {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Ana"));
    }

    public static boolean isPalindrome(String str){
        boolean isPalindrom = true;
        for ( int i = 0; i < str.length()/2; i++){
            if(str.toLowerCase().charAt(i) != str.toLowerCase().charAt(str.length()-1-i)){
                isPalindrom = false;
            }
        }
        return isPalindrom;
    }
}
