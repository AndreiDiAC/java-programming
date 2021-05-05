package AleMele_month$$.Arrays_4_10.ArraysBefore10;

import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[] temps = { s.nextDouble(), s.nextDouble(), s.nextDouble(), s.nextDouble(),
                s.nextDouble(), s.nextDouble(), s.nextDouble() , s.nextDouble()  };

        double sum = 0;
        for(double each: temps){
            sum += each;
        }
        System.out.println(sum/ temps.length);
    }
}
