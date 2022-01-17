package $OOP.$Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class a {

    public static void main(String[] args) {
        Map<Character,Character> map = new HashMap<>();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');


        Stack<Character> stack = new Stack<>();
        stack.push('{');
        stack.push('[');
        stack.push('(');

        System.out.println("map.get(stack.pop()) = " + map.get(stack.pop()));


    }
}
