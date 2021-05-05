package day15_logicalops;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 2;
        //check if age IS NOT more then 7. Print "Need to sit in child car seat + age

        if (!(age>7)){
            System.out.println("Need to sit in child car seat. Age = " +  age);
        }else{
            System.out.println("Can sit in normal seat> Age = " + age);
        }
        boolean isSmokingAllowed = false;
        if (!isSmokingAllowed){
            System.out.println("Smoking is not allowed here");
        }else{
            System.out.println("Is smoking allowed");
        }

        boolean isAffordable = false;
        if (!isAffordable){
            System.out.println("Item not affordable");
        }else{
            System.out.println("Get Item");
        }

        String env = "qa";
        if (!env.equals("qa")){
            System.out.println("In wrong environment for QA tasting");
        }

        String carModel = "Tesla";
        if (!carModel.equals("Tesla")){
            System.out.println("Not interested");
        }

        String secretPassword = "abc123";
        String inputPassword = "abc123";
        if (!inputPassword.equals(secretPassword)){
            System.out.println("Incorrect Password");
        }
    }
}
