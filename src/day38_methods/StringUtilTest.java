package day38_methods;
import static day38_methods.StringsUtils.*;
import $$Methods.PalindromeNumber;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if(StringsUtils.isNullOrEmpty(userName)){
            System.out.println("FAIL: Username cannot be null or empty");
        }

        String palindrome  = "ana";
        if(isPalindromeClass.isPalindrome(palindrome)){
            System.out.println("Da, merge! " + palindrome + " is palindrome");
        }

        if(PalindromeNumber.isPalindrome(1234)){
            System.out.println("Numarul tau este palindrome!");
        }else{
            System.out.println("Numarul tau nu este palindrome!");
        }


        isNullOrEmpty("");   // we can call this method without classname because we imported class on the top


        System.out.println(reverse("java"));
        String word = reverse("python");
        String reverse = StringsUtils.reverse(word);
        System.out.println("reverse = " + reverse);

    }
}
