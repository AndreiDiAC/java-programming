package HomeWorkSaim.WalmartStore;

import java.util.ArrayList;

public class WalmartStore {
    String location;
    double totalWorth;
    ArrayList<Item> inventory;
    static String companyName = "Walmart";


    public WalmartStore(String location){
        this.location = location;
        this.inventory = new ArrayList<>();
    }
    public  WalmartStore(String location, ArrayList<Item> inventory){
        this.location = location;
        this.inventory = inventory;
    }

    public double calculateWorth(){
        for(Item each : inventory){
            totalWorth += each.price * each.quantity;
        }
        return totalWorth;
    }

    public void restockInventory(ArrayList<Item> items){
            for(Item addItem : items){
                for(Item each : inventory){
                    if(each.name.equalsIgnoreCase(addItem.name)){
                        addItem.price = each.price;
                    }
                }
                inventory.add(addItem);
            }
        }
    @Override
    public String toString() {
        return "WalmartStore{" +
                "location='" + location + '\'' +
                ", totalWorth=" + calculateWorth() +
                ", inventory=" + inventory +
                '}';
    }
}
