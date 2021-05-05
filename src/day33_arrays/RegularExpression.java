package day33_arrays;

import java.util.Arrays;

public class RegularExpression {
    public static void main(String[] args) {
        String word = "java1sql2html";
        String[] wordArr = word.split("\\d");
        System.out.println(Arrays.toString(wordArr)); //[java, sql, html]

        word = word.replaceAll("\\d", "_");   //java_sql_html
        System.out.println(word);

        String password = "Abcd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")){
            System.out.println("Valid password");
        }else{
            System.out.println("Not valid");
        }
        System.out.println(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$"));


    }
}
