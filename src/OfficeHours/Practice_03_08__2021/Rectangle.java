package OfficeHours.Practice_03_08__2021;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        //double lenght =5;
        //double width =3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the lenght:");
        double lenght = scan.nextDouble();
        System.out.println("Enter the wedth:");
        double width = scan.nextDouble();

        double perimeter = 2*(lenght + width);
        double are = lenght * width;
        System.out.println("perimeter = " + perimeter);
        System.out.println("are = " + are);

    }
}
