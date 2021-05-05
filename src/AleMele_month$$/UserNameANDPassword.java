package AleMele_month$$;

/**
 Given a username and password verify they are valid.
 - The password cannot be less than 5 characters
 -> If it is less print: "Password cannot be less than 5 characters"
 -> If it is more then or equal to 5 print: "Valid password"

 - Also the password should not contain the username
 - If the password has the username in it print:
 "Invalid password, username should not be in it"
 -> Also change the password to have the value: "password"
 */
public class UserNameANDPassword {
    public static void main(String[] args) {
//        String username = "Andrei";
//        String password = "1234Andrei";


//        if(password.length() < 5) {
//            System.out.println("Password cannot be less then 5 characters");
//        }else if(password.toLowerCase().contains(username.toLowerCase())){
//            password = "password";
//            System.out.println("Invalid password, user should not be in it");
//        }else{
//            System.out.println("Valid password");
//        }
//
//        System.out.println(password);


                String userName = "andreea";
                String password = "andreea1234";

                if (password.length() >= 5){
                    if (!password.toLowerCase().contains(userName.toLowerCase())){
                        System.out.println("Valid password");
                    }else{
                        System.out.println("Invalid password, username should not be in it");
                        password = "password";
                    }

                }else{
                    System.out.println("Invalid password");

                }


    }
}
