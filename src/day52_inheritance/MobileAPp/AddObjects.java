package day52_inheritance.MobileAPp;

public class AddObjects {
    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp();
        mobileApp.setName("Youtube");
        mobileApp.useTheApp(10);

        Instagram instagram = new Instagram();
        instagram.setName("Instagram");
        instagram.useTheApp(20);
        instagram.download();

        Discord b22Discord = new Discord();
        b22Discord.setName("Discord");
        b22Discord.setVersion(6.234);
        b22Discord.useTheApp(14);
        b22Discord.download();
        b22Discord.printInfo();
        System.out.println(b22Discord.getName());
    }
}
