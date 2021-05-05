package OfficeHours.Practice_03_31;

public class CountJava {
    public static void main(String[] args) {
        String str = "java is fun. java class today, java";

        int count = 0;

        while(str.contains("java")){
            count++;
            str = str.replaceFirst("java","");
        }
        System.out.println("Java was found " + count + " times.");

    }
}
