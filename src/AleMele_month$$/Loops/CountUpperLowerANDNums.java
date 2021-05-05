package AleMele_month$$.Loops;

/**
 * Given a String, find and print how many uppercase letter, lowercase
 * letter, and number are in the String.
 * Ex:
 * Input: 2juMp41EEkd4s4
 * Output:
 * 3 uppercase letters
 * 6 lowercase letters
 * 5 numbers
 */
public class CountUpperLowerANDNums {
    public static void main(String[] args) {
        String word = "2juMp41EEkd4s4";
        int upperCase = 0;
        int lowerCase = 0;
        int nums = 0;
        char a = 48;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 48 && word.charAt(i) <= 57) {
                nums += 1;
            }else if(word.charAt(i) >= 65 && word.charAt(i) <= 90){
                upperCase += 1;
            }else if(word.charAt(i) >= 97 && word.charAt(i) <= 122){
                lowerCase += 1;
            }
        }
        System.out.println(nums + " numbers");
        System.out.println(upperCase + " uppercase letters");
        System.out.println(lowerCase + " lowercase letters");

    }
}
