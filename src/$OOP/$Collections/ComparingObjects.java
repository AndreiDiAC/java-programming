package $OOP.$Collections;

import java.util.*;

public class ComparingObjects {

    public static void main(String[] args) {

        List<String> lst= new ArrayList<>();

        lst.add("Adam");
        lst.add("John");
        lst.add("Mary");
        lst.add("Diana");

        System.out.println(lst);
        Collections.sort(lst);
        System.out.println("sorted - " + lst);


        Collections.sort(lst, Collections.reverseOrder());
        System.out.println("reverse order - " + lst);

        Collections.sort(lst, Comparator.naturalOrder());
        System.out.println(lst);


        List<Person> plst = new ArrayList<>();
        plst.add(new Person("John",20));
        plst.add(new Person("Adam", 32));
        plst.add(new Person("Mary", 10));
        plst.add(new Person("Mary", 30));
        plst.add(new Person("Mary", 21));
        plst.add(new Person("Mary", 22));

        System.out.println(plst);
        Collections.sort(plst);
        System.out.println(plst);

    }
}



class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


//    @Override
//    public int compareTo(Person o) {
//        if(this.name.charAt(0) > o.name.charAt(0)){
//            return 1;
//        }else if(this.name.charAt(0) == o.name.charAt(0)){
//
//            if(this.age > o.age){
//                return 1;
//            }else if(this.age == o.age){
//                return 0;
//            }else {
//                return 01;
//            }
//        }else {
//            return -1;
//        }
//    }


    @Override
    public int compareTo(Person o) {
        return (this.name.compareTo(o.name) == 0)
                ? Integer.compare(this.age, o.age)
                : this.name.compareTo(o.name);
    }

}
