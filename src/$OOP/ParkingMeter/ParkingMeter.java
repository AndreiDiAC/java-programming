package $OOP.ParkingMeter;

public class ParkingMeter {
    int timeLeft = 0;
    int maxTime;

    public ParkingMeter(int maxTime){
        this.maxTime = maxTime;
    }

    public boolean add(int add){
        boolean result = true;
        int temp = timeLeft;
        if(add == 25){
            timeLeft += 30;
        }
        if(timeLeft > maxTime){
            timeLeft = temp;
            result = false;
        }

        return result;
    }

    public void tick(){
        if(timeLeft > 0){
            timeLeft--;
        }
    }

    public boolean isExpired(){
        if(timeLeft == 0){
            return true;
        }else {
            return false;
        }
    }
}
