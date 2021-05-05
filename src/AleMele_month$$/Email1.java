package AleMele_month$$;

public class Email1 {
    public static void main(String[] args) {
        String email = "mike_tyson@gmial.com";
        if(!email.contains("_")){
            System.out.println(email);
        }else{
            System.out.println(email.substring(email.indexOf("_")+1, email.indexOf("@")) +"_" + email.substring(0,email.indexOf("_")) + "@gmail.com");
        }
    }
}
