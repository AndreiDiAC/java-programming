package OfficeHours.Practice_08_03;

import java.security.Key;
import java.util.*;

public class ListOFMaps {

    public static void main(String[] args) {

        List<Map<String,String>> employees = new ArrayList<>();

        Map<String,String> emp1data = new HashMap<>();

        emp1data.put(null,"asd");
        emp1data.put("asd",null);
        emp1data.put("1",null);
        System.out.println(emp1data);


        Map<String,String> emp2Data = new HashMap<>();

        emp2Data.put("emp","2311");
        emp2Data.put("empname","Teodora");
        emp2Data.put("jobTile","developer");
        emp2Data.put("salary","200000");

        employees.add(emp1data);
        employees.add(emp2Data);
        System.out.println(employees);

        System.out.println(employees.get(1).get("salary"));

        System.out.println(employees.get(1).put("salary","300000"));
        System.out.println(employees);


        System.out.println("===========================================================");

        // List, I want to remove duplicates

        List<String> list = Arrays.asList("23","1","sf","1");



    }
}
