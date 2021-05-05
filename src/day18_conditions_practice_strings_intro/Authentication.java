package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int last4SSN = 1234;
        int pinCode = 0000;

        int expLast4SSN = 234;
        int expPinCode = 0000;

//        if(last4SSN == expLast4SSN && pinCode == expPinCode) {
//            System.out.println("Authentication successful");
//        }else{
//            System.out.println("Authentication unsuccessful");
//            if (last4SSN != expLast4SSN){
//                System.out.println("Last 4 of SSN did not match");
//            }
//            if(pinCode != expPinCode ){
//                System.out.println("Pin code doesn't match");
//            }
        if(last4SSN == expLast4SSN && pinCode == expPinCode) {
            System.out.println("Authentication successful");
        }else if(last4SSN != expLast4SSN && pinCode != expPinCode){
            System.out.println("Your Pin and last 4 SSN unsuccessful");
        }else if(last4SSN != expLast4SSN){
            System.out.println("Last 4 of SSN did not match");
        }else if(pinCode != expPinCode ){
            System.out.println("Pin code doesn't match");
        }
    }
}
