package day63_Collections;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        //LIFO
        Stack<String> bookStack = new Stack<>();

        bookStack.add("Harry Potter");
        bookStack.add("Leaders eat last");

        System.out.println(bookStack);

        System.out.println(bookStack.pop());

        System.out.println(bookStack);

        System.out.println(bookStack.remove(0));

        System.out.println(bookStack);





    }
}
