package day52_inheritance.MobileAPp;

public class Discord extends MobileApp{
    public void chat(String someOne){
        System.out.println("Chatting with " + someOne + " in Discord");

    }

    @Override
    public void useTheApp(int minutes){
        super.useTheApp(minutes);
        chat("Vladislav");
    }

    @Override
    public boolean download(){
        System.out.println("Downloaded Discord 0.0.23 from App store");
        return true;
    }

    public void printInfo(){
        System.out.println("App Name = " + getName());
        System.out.println("App Version = " + getVersion());
    }
}
