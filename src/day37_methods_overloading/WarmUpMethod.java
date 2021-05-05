package day37_methods_overloading;
import java.util.Scanner;
public class WarmUpMethod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        loginVoid("A","1234word");
//        loginVoid(s.next(), s.next());

        System.out.println(loginBool("Andrei","1234word"));

        boolean isLoginSuccess = loginBool("nadir","mountain"); //false
        System.out.println("isLoginSuccess = " + isLoginSuccess);

        if(loginBool("nadir","mountain")){
            System.out.println("Welcome to Canvas, select course of calendar");
        }else{
            System.out.println("something wrong with your continue");
        }

    }



    public static void loginVoid(String userName, String password){
        String secretUserName = "Andrei";
        String secretPassword = "1234word";
        if(userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)){
            System.out.println("Login successful");
        }else{
            System.out.println("Incorrect user or password");
        }
    }



    public static boolean loginBool (String username, String password) {
        String secretUserName = "Andrei";
        String secretPassword = "1234word";

//        if (username.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)) {
//            return true;
//        } else {
//            return false;
//        }    or
        return username.equalsIgnoreCase(secretUserName) && password.equals(secretPassword);

    }

}
