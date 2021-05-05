package AleMele_month$$;

/**
 [Morning or Night]
 Given some time value (int) in 24 hours format. Print if its the morning or night.
 0 - 11 : Morning
 12- 24 : Night
 -> You can assume the value given is always valid (in the 24 hours range), but if you want a
 challenge use an if to control invalid values
 */
public class MorningOrNight {
    public static void main(String[] args) {
        int hour = 25;


        String time =(hour >= 0 && hour <= 24) ? (hour >= 0 && hour <= 11) ? "Morning" : "Nihgt": "Invalid input";
        System.out.println(time);
    }
}
