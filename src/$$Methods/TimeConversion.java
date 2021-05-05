package $$Methods;

import java.util.Arrays;

public class TimeConversion {
    public static void main(String[] args) {

        timeConversion("12:00:00");
    }

    public static void timeConversion(String s){


        if(s.contains("PM")){
            String[] arr = s.split(":");
            int hour = Integer.parseInt(arr[0]);
            if(hour <  12){
                hour += 12;
            }
            arr[0] = String.valueOf(hour);
            s = String.join(":",arr);
            System.out.println(s.replace("PM",""));
        }else if(s.contains("12") && s.contains("AM")){
            System.out.println(s.replace("12","00").replace("AM",""));
        }else if(s.contains("AM")){
            System.out.println(s.replace("AM",""));
        }else{
            System.out.println(s);
        }

    }
}
