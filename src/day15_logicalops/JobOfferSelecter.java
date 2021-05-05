package day15_logicalops;

public class JobOfferSelecter {
    public static void main(String[] args) {
        //location, salary, isRemote, benefits
        String location = "Chicago, Il";
        double salary = 120000;
        boolean isRemote = true;
        boolean benefits = true;
        if (location.equals("Chicago, Il") && salary>=120_000 && isRemote && benefits){
            System.out.println("I accept the job!");
        }else{
            System.out.println("I do not accept the job!");
        }
    }
}
