package $OOP.GasTank;

public class GasTank {
    double amount = 0;
    double capacity;

    public GasTank(double capacity){
        this.capacity = capacity;
    }

    public void addGas(double gas){
        amount += gas;
        if(amount > capacity){
            amount = capacity;
        }
    }

    public void useGas(double useGas){
        amount -= useGas;
        if(amount < 0){
            amount = 0;
        }
    }

    public boolean isEmpty(){
        return amount < 0.1 ? true : false;
    }

    public boolean isFull(){
        return amount > capacity - 0.1 ? true : false;
    }

    public double getGasLevel(){
        return amount;
    }

    public double fillUp(){
        return amount = capacity;
    }
}
