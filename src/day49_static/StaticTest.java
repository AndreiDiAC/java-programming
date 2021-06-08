package day49_static;

public class StaticTest {
    static String word = "java";

    public static void main(String[] args) {

        StaticMethods.displayMessage("Wooden spoon");

//        StaticMethods.instanceMethod() --> ERROR: no object. this is a instance method, no static keyword
        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();

//        StaticMethods.anotherStaticMethod();

        stm.set(10);
        System.out.println(stm.get());

        System.out.println(word);

    }
}
