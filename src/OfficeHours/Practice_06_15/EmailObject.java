package OfficeHours.Practice_06_15;

public class EmailObject {
    public static void main(String[] args) {

        Email email = new Email("anton@cybertekschool.com",43);
//        email.ADDRESS = "email"; -> ADDRESS is final, so can not be changed
        System.out.println(email);
        System.out.println(Gmail.domain);
        System.out.println(Email.domain);
        System.out.println();

        Gmail gmail = new Gmail("Kamran@gmail.com",133);
        System.out.println(gmail);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println();

        Yahoo yahoo = new Yahoo("jamesbond@yahoo.com",3);
        System.out.println(Yahoo.domain);
        System.out.println(Gmail.domain);
        System.out.println(Email.domain);
        System.out.println();

        Email email1 = new Email("random@email.com", 4);
        System.out.println(Yahoo.domain);
        System.out.println(Gmail.domain);
        System.out.println(Email.domain);
        System.out.println();

        Email.sendEmail();
        Gmail.sendEmail();
        Gmail.sendSuperEmail();



    }
}
