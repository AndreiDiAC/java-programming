package day47_constructors;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student("Andrei");
        Student student4 = new Student(29);
        Student student5 = new Student("Andrei",29);
    }
}
