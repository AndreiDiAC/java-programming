package day50_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Andrei";
        p1.age = 29;

        p1.talk();
        p1.walk();
        p1.work("SDET");

        Teacher t1 = new Teacher();

        t1.teacherID = 1234;
        t1.name = "Murodil";
        t1.age = 33;
        t1.talk();
        System.out.println(t1.name);
        t1.teach("match");

        Student student = new Student();
        student.name = "Andrei";
        student.studentID = 123;
        student.study("match");
        System.out.println(student.toString());;

    }

}
