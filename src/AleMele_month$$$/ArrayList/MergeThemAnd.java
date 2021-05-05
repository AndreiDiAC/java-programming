package AleMele_month$$$.ArrayList;

public class MergeThemAnd {
    public static String mergeStrings(String one, String two) {
        String result = "";
        int maxLength = 0;

        if (one.length() > two.length()) {
            maxLength = one.length();
        } else {
            maxLength = two.length();
        }

        for (int i = 0; i < maxLength; i++) {

            if (i < one.length()) {
                result += one.charAt(i);
            }

            if (i < two.length()) {
                result += two.charAt(i);
            }
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(mergeStrings("aaa","mmmmmm"));
    }
}
