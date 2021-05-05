package day20_string_manipulation;

public class StringEmpty {
    public static void main(String[] args) {
        String jobTitle = new String("");


        System.out.println(jobTitle.isEmpty());

        if(jobTitle.isEmpty()){
            System.out.println("JobTitle is missing, please resend");
        }else{
            System.out.println("Job title is good");
        }

        System.out.println(jobTitle.equals(" ")); //false

        if ("".equals(jobTitle)){
            System.out.println("job title is empty");
        }else{
            System.out.println("job title is not empty");
        }

        String word = " ";
        System.out.println(word.isEmpty()); //false
        System.out.println(word.length()); // 1

        String veggie = "carrots";
        System.out.println(veggie.isEmpty()); //false

        if(veggie.isEmpty()){
            System.out.println("is empty");
        }else{
            System.out.println("is not emptye");
        }
    }
}
