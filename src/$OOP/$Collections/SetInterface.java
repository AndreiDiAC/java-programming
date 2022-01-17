package $OOP.$Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {

        Set<Long> longSet  = new HashSet<>();

        longSet.add(7L);
        longSet.add(7L);
        longSet.add(7L);
        longSet.add(7L);
        longSet.add(70L);
        longSet.add(70L);

        System.out.println(longSet); //no duplicate


        longSet.add(null);
        System.out.println(longSet);

        //hasSet based on hasMap internally

        System.out.println(new String("Adam").hashCode() ); //2035631
        System.out.println(new String("Adam").hashCode() ); //2035631
        System.out.println(new String("Adam").hashCode() ); //2035631


        Set<Person> pSet = new HashSet<>();







    }
}
