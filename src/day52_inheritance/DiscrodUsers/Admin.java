package day52_inheritance.DiscrodUsers;

public class Admin extends User{
    public Admin(){
       super(); //call super class/User class no-args constructor
        // this super() from above is running by default, you don t have to type it
        System.out.println("Admin class constructor");
    }

    public Admin(String name, int id){
//        super("Admin", name, id);
            System.out.println("Admin class 2 args contructor");
    }

    public String toString(){
        return "Admin{" +
                "role='" + getRole() + '\'' +
                ", name='" + getName() + '\'' +
                ", id=" + getId() +
                '}';
    }
}
