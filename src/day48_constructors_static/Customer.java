package day48_constructors_static;

public class Customer {
    private String name;
    private int id;


    public Customer(){
        System.out.println("no-args constructors");
        name = "new constructor";
        id = 1;
    }

    public Customer(String name, int id){
        System.out.println("2-args constructors");
        this.name = name;
        this.id = id; //set(id) when we have some condition in setter
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer -> " +
                "name = '" + name + '\'' +
                ", id = " + id ;
    }
}
