package day04_variable_intro;

public class AmazonItem {
    public static void main(String[] args) {
        String description = "HIC wooden spoon";
        int ratingsCount = 181;
        double price = 5.99;
        String seller = "Amazon.com";
        boolean prime = true;


        System.out.println("--- PRODUCT INFORMATION ---");
        System.out.println(description);
        System.out.println(" * * * * *");
        System.out.println(ratingsCount);
        System.out.println(price);
        System.out.println(seller);
        System.out.println(prime);
    }
}
