package day48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1.toString()); //print with default value that are set in no-args constructors
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike",2);  //create object and assign values in same statement
        System.out.println(cs2);

        Customer cs3 = new Customer("John Word", 4873);
        System.out.println(cs3);

        Customer cs4 = new Customer("Andrei",12);
        cs4 = new Customer("Andreea", 2);
        System.out.println(cs4);

        //Array of Customers
        Customer [] customers = {cs1,cs2,cs3,cs4, new Customer("Bashir",449)};
        //or
        Customer [] todaysCustomers = new Customer[4];
        todaysCustomers[0] = cs1;
        todaysCustomers[1] = cs2;
        todaysCustomers[2] = cs3;
        todaysCustomers[3] = new Customer("Andrei",1234);

        List<Customer> ourCustomers = new ArrayList<>(Arrays.asList(cs1,cs2,cs3, new Customer("Alex",23)));

        List<Customer> customersList = new ArrayList<>();
        customersList.add(cs1);
        customersList.add(cs2);
        customersList.add(new Customer("Suleyman", 98734));

        System.out.println(customers);
        System.out.println(todaysCustomers);
        System.out.println(ourCustomers);
        System.out.println(customersList);

        System.out.println(customers[0]);
        System.out.println(customers[1].toString());

        System.out.println(customersList.get(0));

        System.out.println(customersList);
        System.out.println(customersList.toString());


        System.out.println("-----FOR EACH LOOP-----");
        for( Customer each : customersList){
            System.out.println(each);
        }

        //print all names of Customers in the list
        for (Customer customer : customersList) {
            System.out.println(customer.getName());
        }
        //forEach method and lambda expression
        customersList.forEach(each -> System.out.println(each.getName()));




    }
}
