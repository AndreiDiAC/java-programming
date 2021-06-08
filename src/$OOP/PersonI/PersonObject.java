package $OOP.PersonI;
import java.util.*;
public class PersonObject {

    public static void main(String[] args) {
        Person person = new Person("Andrei","Diaconu",29);

        System.out.println(person);
        System.out.println("person.getFirstName() = " + person.getFirstName());
    }
}
