package day47_constructors;

public class Address {
    // instance variable
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country = "USA";

    //constructor
    public Address(){   // for creating the object by default
        System.out.println("Address constructor");
        street = "123 unknown st";
        city = "Unknown";
        state = "Unknown";
        zipCode = "00000";
    }

    public Address(String street,String city,String state,String zipCode ){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if(street.isEmpty() || street.length() > 50){
            System.out.println("Error: Invalid street");
            //System.exit(0);
        }else{
            this.street = street;
        }


    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address: " +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'';
    }
}

class RealAddress{
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("2930 Mango Ave");
        address.setCity("Chicago");
        address.setState("Illinois");
        address.setZipCode("60639");

        System.out.println(address.getStreet() + ", " + address.getCity() + ", " + address.getState() +
                ", " + address.getZipCode());

        System.out.println(address.toString());

        Address newAddress = new Address();
        System.out.println(newAddress.toString());

        Address newAddress2 = new Address();
        newAddress2.setStreet("4327 W Bre Ave");
        newAddress2.setCity("Chicago");
        newAddress2.setZipCode("00022");

        Address newAddress3 = new Address("123 BOO str","Chicago","Il","43621");
        System.out.println("newAddress3 = " + newAddress3);
        System.out.println(newAddress3.getCity());


        Address ourAddress = new Address();
        System.out.println(ourAddress.getCity());
        ourAddress.setCity("Texax");
        System.out.println(ourAddress.getCity());




    }
}
