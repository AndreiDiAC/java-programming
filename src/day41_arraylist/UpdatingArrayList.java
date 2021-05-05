package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0,"jeep");
        myCars.add(1,"lada");
        myCars.add(2,"yogo");
        System.out.println(myCars.toString());
        String allCarsIn1Str = myCars.toString();
        System.out.println("allCarsIn1Str = " +allCarsIn1Str);

        //change index 0 to Lamborghini
        myCars.set(0,"Lamborghini");
        System.out.println(myCars);

        myCars.set(4,"Honda");
        //find the index number if "ford"
//        String str = "java";
//        str.indexOf("v");
        System.out.println("index of ford = " + myCars.indexOf("ford"));
        int moskvichIndex = myCars.indexOf("moskvich");
        System.out.println(moskvichIndex);
        //change moskvich to jiguli
        myCars.set(moskvichIndex, "jiguli");
        myCars.set(myCars.indexOf("ford"), "trabant");
        System.out.println("after set to tabant = " + myCars);

        //lada -> bugatti
        /*  if myCards contains "lada"
                find index of lada and set value to bugatti
            else
            print "lada is not found
        */

        if(myCars.contains("lada")){
            myCars.set(myCars.indexOf("lada"), "bugatti");
        }else{
            System.out.println("lada is not found it");
        }
        System.out.println("after set bugatti = " + myCars);

        /*
        lamborghini -> prius
        lada -> lexus
        trabant -> audi

         */

        for( int i = 0; i < myCars.size(); i++){
            if(myCars.get(i).equalsIgnoreCase("Lamborghini")){
                myCars.set(i, "prius");
            }else if(myCars.get(i).equalsIgnoreCase("toyota")){
                myCars.set(i,"lexus");
            }else if(myCars.get(i).equalsIgnoreCase("trabant")){
                myCars.set(i,"audi");
            }
        }
        System.out.println(myCars);


    }
}
