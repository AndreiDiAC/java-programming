package $$StreamExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

    public static void main(String[] args) {

        List<Product> list =  new ArrayList<>();
        for(Product product : getProducts()){
            if(product.getPrice() > 25000f){
                list.add(product);
            }
        }

        for(Product each : list){
            System.out.println(each);
        }

        System.out.println("================================================");

        //using stream API

        List<Product> list2 = getProducts().
                stream().
                filter(product -> product.getPrice() > 25000f)
                .collect(Collectors.toList());
        list2.forEach(System.out::println);

        //or
        System.out.println("========================================================");

        getProducts().
                stream().
                filter(product -> product.getPrice() > 25000f)
                .forEach(System.out::println);



    }

    private static List<Product> getProducts(){
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1,"HP Laptop", 25000f));
        productList.add(new Product(2,"Dell Laptop", 30000f));
        productList.add(new Product(3,"Lenovo Laptop", 28000f));
        productList.add(new Product(4,"Sony Laptop", 2800f));
        productList.add(new Product(5,"Apple Laptop", 90000f));
        return productList;

    }
}

class Product{
    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}