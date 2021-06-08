package $OOP.TV1;

public class TV {
    int channel = 1;
    int volumeLevel = 0;
    boolean on = false;
    String brand = "undefined";

    public TV(){
        System.out.println("Creating TV object using no args-constructor");
    }

    public TV(String brand){
        System.out.println("Creating TV object using 1 arg - constructor");
        this.brand = brand;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if(on == false){
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }else{
            if(channel > 120 || channel < 0){
                System.out.println("ERROR: TV is either OFF or invalid Channel");
            }else{
                this.channel = channel;
            }
        }


    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if(on || volumeLevel > 7 || volumeLevel < 0){
            this.volumeLevel = volumeLevel;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }


    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void channel1Up(){
        if(on){
            channel++;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }

    }

    public void channel1Down(){
        if(on){
            channel--;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }

    public void volumeUp(){
        if(on || volumeLevel < 7 || volumeLevel < 0 ){
            volumeLevel++;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }

    }

    public void  volumeDown(){
        if(on){
            volumeLevel--;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public void isOn(){
        System.out.println(on);
    }

    public void turnOn(){
        if(on){
            System.out.println("TV is already ON");
        }else{
            on = true;
        }
    }

    public void turnOff(){
        if(on){
            on = false;
        }else{
            System.out.println("TV is already OFF");
        }
    }


}
