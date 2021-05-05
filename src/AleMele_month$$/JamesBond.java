package AleMele_month$$;

import java.util.Locale;

/**
 Given two String variables. One is a full name and the second a last name.
 Check if the full name has the same last name as the other String.
 Ex:
 s: "james bond"
 s: "bond"
 output: Same last name

 s: "alex benji"
 s: "bond"
 output: Not the same last name
 */
public class JamesBond {
    public static void main(String[] args) {
        String fullName = "James bond";
        String lastName = "Bond";

        if(fullName.toLowerCase().contains(lastName.toLowerCase())){
            System.out.println("Same last name");
        }else{
            System.out.println("Not the same last name");
        }


    }

}
