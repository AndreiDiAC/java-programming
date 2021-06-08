package OfficeHours.Practice_06_07;

import java.util.ArrayList;

public class WalmartStore {
    String location;
    double totalWorth;
    ArrayList<Item> inventory;
    static String companyName;

    static {
        companyName = "Walmart";
    }

    public WalmartStore(String location){
        this.location = location;
        this.inventory = new ArrayList<>();
    }

    public WalmartStore(String location, ArrayList<Item> allItems){
        this.location = location;
        // this.inventory = allItems;
        this.inventory = new ArrayList<>(allItems);
        calculateWorth();
    }

    public void calculateWorth(){
        for(Item eachItem : inventory){
            totalWorth += (eachItem.price * eachItem.quantity);
        }
    }
}
