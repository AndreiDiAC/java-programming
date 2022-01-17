package $$Methods;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));

    }
    public static boolean isPalindrome(int num){
            int palindrome = 0;
            int realNum = num;
            while(num > 0){
                int lastDigit = num % 10;
                palindrome = palindrome * 10 + lastDigit;
                num = (num - lastDigit) /10;
            }
        return realNum == palindrome;
    }
}
