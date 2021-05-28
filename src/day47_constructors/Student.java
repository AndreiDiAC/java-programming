package day47_constructors;

public class Student {

    public Student() {
        System.out.println("No-Args constructor");
    }

    public Student(String name){
        System.out.println("name param constructor " + name );
    }

    public Student(int age){
        System.out.println("age param constructor " + age);
    }
    public Student(String name, int age){
        System.out.println("String and age param constructor " + name + ", " + age);
    }
}

