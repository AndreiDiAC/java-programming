package HomeWorkSaim.WalmartStore;

import java.util.ArrayList;
import java.util.Arrays;

public class Objects {
    public static void main(String[] args) {
        Item banana = new Item("banana",1.99,1);
        Item apple = new Item("apple", 2.99, 2);

        Item orange = new Item("orange", 2.49, 5);
        Item strawberry = new Item("strawberry", 3.99,6);
        Item banana2 = new Item("banana",2.99,3);

        WalmartStore walmartStore1 = new WalmartStore("address1", new ArrayList<>(Arrays.asList(banana,apple)));
        System.out.println(walmartStore1.inventory);

        System.out.println("walmartStore1.calculateWorth() = " + walmartStore1.calculateWorth());

        walmartStore1.restockInventory(new ArrayList<>(Arrays.asList(orange,strawberry,banana2)));

        System.out.println(walmartStore1);

        WalmartStore store2 = new WalmartStore("address2");
        store2.restockInventory(new ArrayList<>(Arrays.asList(orange,banana)));
        System.out.println(store2);

        System.out.println(WalmartStore.companyName);
    }
}
