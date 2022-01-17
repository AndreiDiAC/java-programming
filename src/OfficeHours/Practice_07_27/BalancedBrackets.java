package OfficeHours.Practice_07_27;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {

/*
* Create a method that will accept a String of brackets.
* Determine if the brackets are balanced. Brackets are balanced if the closing bracket matches the opening one.
* https://www.hackerrank.com/challenges/balanced-brackets/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues

Hint: Use HashMap for the bracket pairs and Stack to help keep track of which opening brackets
* have been seen and need to be closed

Ex: {([])} -> balanced
    {[(])} -> not balanced

Stack = Last in Fist Out

* Algorithm
* declare a character Stack
* Traverse the spring (iter)
* If the current character is a starting/opening bracket push to the stack
* If the current character is a closing bracket the pop from the stack and
*
* E pop()
* Removes the objet at the top of this stack and returns that object as te value of this function
*
* E push()
Pushes an item onto the top of this stack
 */
public static void main(String[] args) {
    System.out.println("isBalanced(\"{[()]}\") = " + isBalanced("(((())))"));
}

    public static boolean isBalanced(String exp){

        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch=='(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else if(ch==')' || ch == ']' || ch == '}'){
                if(stack.isEmpty()){
                    return false;
                }else if(ch != map.get(stack.pop())){
                    return false;
                }
            }
        }

        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }





    public static boolean isBalanced2(String str){
        String open = "{[(";
        Stack<Character> stack = new Stack();
        Map<Character, Character> map = new HashMap();
        map.put('{','}'); map.put('[',']'); map.put('(',')');

        for (int i = 0; i < str.length(); i++) {
            if(open.contains(""+str.charAt(i))){
                stack.push(str.charAt(i));
            }else{
                if(stack.isEmpty()||str.charAt(i) != map.get(stack.pop())){
                    return false;
                }
            }

        }
        return stack.isEmpty();

    }
}


