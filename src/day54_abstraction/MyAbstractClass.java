package day54_abstraction;

public abstract class MyAbstractClass { //abstract keyword is used to create an abstract class in java
    int num = 55;
    public void learn(){
        System.out.println("Learning..");
    }

    public abstract void close();  //this is abstract method -> method with no implementation, just the signature.

}

class Sub extends MyAbstractClass{
    public void close(){
        System.out.println("Close - abstract method implementation");
    }
}



class MyObjects{
    public static void main(String[] args){
//        MyAbstractClass mac = new MyAbstractClass();
        Sub sub = new Sub();
        sub.learn();
        System.out.println(sub.num);
        sub.close();
        sub.learn();
    }
}
