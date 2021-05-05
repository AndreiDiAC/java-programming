package AleMele_month$$;

public class Email2 {
    public static void main(String[] args) {
        String email = "craig_federighi@apple.com";
//        String firstName = email.substring(1, email.indexOf("_"));
//        String fistCap ="" + email.toUpperCase().charAt(0);
//        String lastName =""+ email.substring(email.toUpperCase().indexOf("_") +1,email.indexOf("@"));
//        String secondCap = "" + lastName.toUpperCase().charAt(0);
//        String domain = "" + email.substring(email.indexOf("@")+ 1, email.indexOf("."));
//
//
//
//
//        System.out.println("First name: " + fistCap + firstName);
//        System.out.println("Last name: " + secondCap + lastName.substring(1));
//        System.out.println("Domain: " + domain);

        String firstName = "" + email.toUpperCase().charAt(0) + email.substring(1,email.indexOf("_"));
        System.out.println("First name: " + firstName);

        String lastName = "" + email.toUpperCase().charAt(email.indexOf("_")+1) +
                email.substring(email.indexOf("_")+2, email.indexOf("@"));
        System.out.println("Last name: " + lastName);

        String domain = email.substring(email.indexOf("@")+1,email.indexOf(".") );
        System.out.println("Domain: " + domain);

        String cap ="" + email.toUpperCase().charAt(email.indexOf("_")-1);
        System.out.println(cap);




    }
}
