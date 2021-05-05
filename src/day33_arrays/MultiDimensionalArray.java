package day33_arrays;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        String[][] users = new String[3][2];
        users[0][0] = "Teodora Tsvetanov";
        users[0][1] = "TeodorasPWD12";
        users[1][0] = "Anna Ziyayeva";
        users[1][1] = "AnnaALmaty123";
        users[2][0] = "Parvin Altae";
        users[2][1] = "ParvinVienna321";

        String[][] userData = { {"Teodora Tsvetanov","TeodorasPWD12"},
                                {"Anna Ziyayeva","nnaALmaty123"},
                                {"Parvin Altae","ParvinVienna321"} };
        System.out.println("FULL NAMES:");
        System.out.println(userData[0][0].split(" ")[0]); //just for the fist name
        System.out.println(userData[1][0]);
        System.out.println(userData[2][0]);
        System.out.println("-----------------------------");
        System.out.println("PASSWORDS:");
        System.out.println(userData[0][1]);
        System.out.println(userData[1][1]);
        System.out.println(userData[2][1]);

        System.out.println(Arrays.deepToString(userData));
    }
}
