package day19_class_vs_object_strings;

public class LogInTest {
    public static void main(String[] args) {
        String expUserName = "cbertek";
        String expPassword = "Abc123";

        String userName = "Cybertek";
        String password = "Abc123";

        if(expUserName.equalsIgnoreCase(userName) && expPassword.equals(password)){
            System.out.println("Pass - user logged in successfully " );
        }else {
            if(!expUserName.equalsIgnoreCase(userName) && !expPassword.equals(password)){
                System.out.println("Enter pass and user again");
            }else if(!expUserName.equalsIgnoreCase(userName)){
                System.out.println("Fail = username is incorrect");
            }else if (!expPassword.equals(password)){
                System.out.println("Fail - password is incorrect");
            }

        }
    }
}
