package OfficeHours.Practice_04_21_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class ZombieAttack2Saim {
    public static void main(String[] args) {
        int [] a = {1,2,3};
        int [] b = a;
        b[0] = 0;
        System.out.println(Arrays.toString(a)); //  [0,2,3]
        System.out.println(Arrays.toString(b)); //  [0,2,3]
        //de asta nu trebuie sa folosim = b ci sa folosim int [] b = Arrays.copyOf(a, a.length)

    }
}
