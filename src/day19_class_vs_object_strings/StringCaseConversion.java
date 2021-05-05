package day19_class_vs_object_strings;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "JAva";
        System.out.println(word.toLowerCase()); //java

        System.out.println("Orice".toUpperCase()); //ORICE
//---------------------------------------------------------------------------
        String x = "asa";
        x.toUpperCase();
        System.out.println(x); //asa - nu se schimba, trebuie variabila

        String xVariable = x.toUpperCase();
        System.out.println(xVariable); //ASA

        //or
        //change permanently to lower case
        x = x.toLowerCase();
        System.out.println(x);

        //-----------------------------------------------
        String company = "Amazon";
        System.out.println("company in uppercase " + company.toUpperCase());
        System.out.println(company);
        company = company.toUpperCase();
        System.out.println("company = " + company);

    }
}
