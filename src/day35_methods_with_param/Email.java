package day35_methods_with_param;

public class Email {
    public static void main(String[] args) {
        buildEmail("ANDREI diaconu","gmail.com");
    }

    /**
     * @param name
     * @param domain
     */
    public static void buildEmail(String name, String domain){
        name = name.toLowerCase().replace(" ", "_");
        String email =  name + "@" + domain;
        System.out.println("Your email is: " + email);
    }
}
