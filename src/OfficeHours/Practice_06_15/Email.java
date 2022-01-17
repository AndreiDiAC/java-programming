package OfficeHours.Practice_06_15;

import day50_inheritance.StaticBlockDemo;

public class Email {
    final String ADDRESS;
    int numberOfEmail;
    static String domain;

    static {
        domain = "generic";
    }

    public Email(String address, int numberOfEmail){
        this.ADDRESS = address;
        this.numberOfEmail = numberOfEmail;
    }

    public static void sendEmail(){
        System.out.println("Sending from PARENT");
    }

    @Override
    public String toString() {
        return "Email{" +
                "Address='" + ADDRESS + '\'' +
                ", numberOfEmail=" + numberOfEmail +
                ", domain=" + domain +
                '}';
    }

}


