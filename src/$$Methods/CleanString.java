package $$Methods;
import java.util.Scanner;
public class CleanString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(clean(in.nextLine(), in.nextLine()));
    }

    public static String clean (String text ,String badWord) {
        text = text.replace(badWord,"");
        text = text.replace("  "," ");
        text = text.trim();
        return text;

    }
}
