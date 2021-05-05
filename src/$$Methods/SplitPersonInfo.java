package $$Methods;

import java.util.Scanner;

public class SplitPersonInfo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String infoData = s.next();
        person(infoData);
    }

    public static void person(String info){
        String[] infoSplit = info.split(",");
        String name = "person name: " + infoSplit[0];
        String last = "last name: " + infoSplit[1];
        String age = "age: " + infoSplit[2];
        System.out.println(name + "\n" + last + "\n" + age);

    }
}
