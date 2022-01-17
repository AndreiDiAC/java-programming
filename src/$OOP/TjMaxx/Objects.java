package $OOP.TjMaxx;

import java.util.Arrays;

public class Objects {
    public static void main(String[] args) {
//        Item item1 = new Item("banana",10,111,2.99);
//        Item item2 = new Item("apple",5,321,2.99);
//        Item item3 = new Item("corn",20,444,4.44);
//
//
//        TJMaxx tjMaxx1 = new TJMaxx();
//        tjMaxx1.addRegularItem(item1);
//        tjMaxx1.addRegularItem(item2);
//        tjMaxx1.addRegularItem(item3);
//
//        OnSaleItem onSaleItem1 = new OnSaleItem("peaches",10,123,2.99,0.50);
//
//        System.out.println(tjMaxx1.getItemPrice(123));
//
//        tjMaxx1.addOnSaleItem(onSaleItem1);
//        System.out.println(tjMaxx1.getOnSaleItem("peaches"));
//
//        tjMaxx1.removeItem(444);
//        System.out.println(tjMaxx1.getAllItemNames());
//        tjMaxx1.removeItem(123);
//        System.out.println(tjMaxx1.getAllItemNames());
//
//
//        System.out.println(item3);
//        tjMaxx1.buyItem(444);
//        System.out.println(item3);
//
//        item3.setQuantity(10);
//        System.out.println(item1);
//
//        System.out.println("item3.getQuantity() = " + item3.getQuantity());
//
//        item3.setQuantity(item3.getQuantity()-5);
//        System.out.println(item3);
//
//
//        System.out.println(tjMaxx1.getAllItemNames());
//        tjMaxx1.buyItem(111);
//        System.out.println(item1);
//
//        System.out.println("tjMaxx1.getItemPrice(123) = " + tjMaxx1.getItemPrice(123));


        Item Pen = new Item("Pen",10,1,2.5);
        Item Hat = new Item("Hat",2,2,10);
        Item Cups = new Item("Cups",1,3,3.6);
        OnSaleItem Light = new OnSaleItem("Light",4,4,30,10);
        OnSaleItem Towel = new OnSaleItem("Towel",4,5,12.4,15);

        TJMaxx store = new TJMaxx();
        store.addRegularItem(Pen);
        store.addRegularItem(Hat);
        store.addRegularItem(Cups);
        store.addOnSaleItem(Light);
        store.addOnSaleItem(Towel);
        System.out.println(store.getAllItemNames());

        int before = store.regularItemsCount() + store.onSaleItemsCount();
        store.buyItem(3);
        int after =  store.regularItemsCount() + store.onSaleItemsCount();
        System.out.print(before == after);

        System.out.println(store.getAllItemNames());


    }

}
