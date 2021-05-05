package day15_logicalops;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Iasi";
        if (city.equals("Iasi") || city.equals("Chicago")){
            System.out.println(city + " this is true");
        }else{
            System.out.println(city + " is not the city");
        }

        String teacher = "Saim";
        if (teacher.equals("Saim") || teacher.equals("Muradil")){
            System.out.println("It is java classes with " + teacher);
        }else if(teacher.equals("Nadir")){
            System.out.println("Soft skill with class with " +  teacher);
        }else{
            System.out.println("Some class with " + teacher);
        }

        String company = "Google";
        int salary = 85_000;
        if (company.equals("Google") || salary >= 100_000){
            System.out.println("Accept offer!");
        }else{
            System.out.println("Refuse!");
        }


    }
}
