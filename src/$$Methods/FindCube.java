package $$Methods;

import java.util.Scanner;

public class FindCube {
    public static void main(String[] args) {
        cube();
    }

    public static void cube(){
        Scanner s = new Scanner(System.in);
        int inputNum = s.nextByte();
        System.out.println(inputNum * inputNum * inputNum);
    }
}
