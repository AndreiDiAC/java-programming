package day48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;

public class CyberTekGroups {
    public static void main(String[] args) {
        Group group1 = new Group("Cyberbugs"); //dependency injection. Group object creation depends on String name

        //print size of members
        System.out.println(group1.getMembers().size());
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Ali");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Maria");
        System.out.println(group1.getMembers().size());
        System.out.println(group1.getMembers());

        Group group4 = new Group("CyberCats");
        group4.setMembers(new ArrayList<>(Arrays.asList("Andrei","Andreea","Stephen",
                "Wakshum","Akrem","Bulent")));
        System.out.println(group4.getMembers());

        if(group4.getMembers().contains("Akrem")){
            System.out.println("Akrem is member of group4");
        }else{
            System.out.println("Akrem is not in group4");
        }

        group1.removeMember("Pavel");
        group1.removeMember("Elvin");
        System.out.println(group1);

    }
}
