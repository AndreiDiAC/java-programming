package AleMele_month$$;

import java.util.Scanner;

public class Alejandro {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String a = s.nextLine();

        String alejandro = "alejandro";
        String project = "project";

        if(a.toLowerCase().contains(alejandro.toLowerCase()) && a.toLowerCase().contains(project.toLowerCase())){
            System.out.println("read");
        }else{
            System.out.println("don't read");
        }


    }
}
