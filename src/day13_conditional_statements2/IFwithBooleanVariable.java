package day13_conditional_statements2;

public class IFwithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;
        if (isHungry){
            System.out.println("I am hungry! I will go get something to eat.");
        }else{
            System.out.println("I am not hungry! Lets keep coding java");
        }

        double price = 130.44;
        boolean isAffordable = price <= 200.0;
        if (isAffordable){
            System.out.println("I can afford it!");
        }else{
            System.out.println("Too expensive!");
        }



        boolean isRemoteJob = true;
        if (!isRemoteJob ){
            System.out.println("Sorry I am not interested.");
        }else{
            System.out.println("Sure I am interested, what is the interview process?");
        }



    }
}
