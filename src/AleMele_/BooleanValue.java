package AleMele_;
/*
[If statement, operators]

Write a program that will accept a boolean value. Print out the opposite of the given boolean

Ex: true -> false
    false -> true
 */
public class BooleanValue {
    public static void main(String[] args) {
        boolean a= false;
        if(a ==true ){
            System.out.println(a +" -> " + !a);
        }else{
            System.out.println(a + " -> "+ !a);
        }
    }

}

