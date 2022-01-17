package OfficeHours.Practice_06_15;

public class Yahoo extends Email{
    static String domain;  //delete this
    static {
        domain = "yahoo";
    }

    public Yahoo(String address, int numberOfEmail) {
        super(address, numberOfEmail);
    }
}
