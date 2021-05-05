package AleMele_month$$;

public class OfficeHourseSchedule {
    public static void main(String[] args) {
        String day = "Thsday";


        if ( day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")){
            System.out.println("Office hours at 5:30 - 6:45 EST");
        }else if(day.equals("Thursday")){
            System.out.println("Soft Skill day");
        }else if(day.equals("Friday")){
            System.out.println("Day off");
        }else if(day.equals("Saturday") || day.equals("Sunday")){
            System.out.println("Already a long day, no office house.");
        }else{
            System.out.println("Invalid day given");
        }

    }
}
