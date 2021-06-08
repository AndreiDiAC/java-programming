package day49_static;

public class StaticMethods {
    int num = 10;
    static int count = 5;


    public static void displayMessage(String message){
        System.out.println("message: " + message);
        //System.out.println("num = " + num);  //ERROR: num is instance variable. static can not access
        System.out.println("count = " + count);  //no error.count is static variable
    }

    public static void anotherStaticMethod(){
        System.out.println("another static method");
        displayMessage("wooden spoon");
        count = 11;
    }

    //StaticMethods.instanceMethod(); > no
    //stm.instanceMethod()
    public void instanceMethod(){
        System.out.println("instanceMethod");
        System.out.println("num = " + num);
        System.out.println("count = " + count);
        displayMessage("from instance method");
    }

    public void set(int num){
        this.count = num;
    }
    public int get(){
        return count;
    }

}
