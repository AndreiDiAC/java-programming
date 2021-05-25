package $$Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class Holidays {
    public static void main(String[] args) {
        System.out.println(monthNumber(9));
    }
    public static ArrayList<String> holidays(){
        ArrayList<String> holidays = new ArrayList<>(Arrays.asList("New Years day","Martin Luther King","Jr. Day",
                "President's Day","Memorial Day","Independence Day","Labor Day","Columbus Day","Veterans Day",
                "Thanksgiving Day","Christmas Day"));
        return holidays;


    }

    public static ArrayList<String> monthNumber(int num){
        ArrayList<String> list = new ArrayList<>();
        if(num > 0 && num <= 12){
            switch (num){
                case 1:
                    list.add(holidays().get(0));
                    list.add(holidays().get(1));
                    list.add(holidays().get(2));
                    break;
                case 2:
                    list.add(holidays().get(3));
                    break;
                case 5:
                    list.add(holidays().get(4));
                case 6:
                    list.add(holidays().get(5));
                    break;
                case 9:
                    list.add(holidays().get(6));
                    break;
                case 10:
                    list.add(holidays().get(7));
                    break;
                case 11:
                    list.add(holidays().get(8));
                    list.add(holidays().get(9));
                    break;
                case 12:
                    list.add(holidays().get(10));
                    break;
                default:
                    list.add("None");
            }
        }else{
            return null;
        }
        return list;



    }
}
