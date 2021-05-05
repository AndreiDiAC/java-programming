package AleMele_month$$$.ArrayList;

public class CountLettersFormString {
    public static void main(String[] args) {
        String s = "opendoor";
        System.out.println(countLetters(s));
    }

    public static String countLetters(String str) {

        String countLetters = "";
        for (int i = 0; i < str.length(); i++) {
            if (countLetters.contains("" + str.charAt(i))) {
                continue;
            }
            int count = 0;

            for (int f = 0; f < str.length(); f++) {
                if (str.charAt(i) == str.charAt(f)) {
                    count++;
                }
            }
            countLetters += "" + count + str.charAt(i);


        }
        return countLetters;
    }
}
