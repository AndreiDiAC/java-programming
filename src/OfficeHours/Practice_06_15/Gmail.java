package OfficeHours.Practice_06_15;

public class Gmail extends Email{
    static String domain;  //delete this
    static {
        domain = "Gmail";
    }

    public static void sendEmail(){
        System.out.println("Sending from Gmail");
    }

    public static void sendSuperEmail(){
        Email.sendEmail();
    }

    public Gmail(String address, int numberOfEmail) {
        super(address, numberOfEmail);
    }
}
