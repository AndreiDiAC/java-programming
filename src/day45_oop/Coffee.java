package day45_oop;

public class Coffee {
    int amount;
    String type;

    @Override
    public String toString() {
        return "Coffee{" +
                "amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }

    public void refill(){
        amount = 100;
    }

    public void drink(int someAmount){
        amount -= someAmount;
    }

    public int getAmount(){
        return amount;
    }

    public void setType(String newType){
        type = newType;
    }

    public String getType(){
        return type;
    }



}

class coffeeTest{
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();

        System.out.println("coffee amount after refill = " + myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("amount after drink 10% = " + myCoffee.getAmount());

        myCoffee.setType("Turkish coffee");
        System.out.println("My Coffee = " + myCoffee.getType());

        //describe myCoffee - show all variable values
        System.out.println(myCoffee.toString());

        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 type = " + coffee1.getType());

        //assign coffee1 object to coffee2
        //hey java, pont coffee2 to same object as coffee1
        Coffee coffee2 = coffee1;
        System.out.println("coffee2 type = " + coffee2.getType());  //cappuccino
        coffee2.setType("Espresso");
        System.out.println(coffee2.getType()); //Espresso"
        System.out.println(coffee1.getType()); //Espresso"

        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappucino");
        System.out.println(coffee3.getType()); //Frappucino

        //pointing to the same object as coffee2
        coffee3 = coffee2;
        System.out.println(coffee3.getType()); //Espresso

        Coffee coffee4 = null; //reference variable does not refer/ point to any object in HEAP
        coffee4.setType("turkish"); // NullPointerException


    }
}
