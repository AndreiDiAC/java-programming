package day50_inheritance;

public class Student extends Person {
    int studentID;

    public void study(String topic){
        System.out.println(name + " is studying " + topic);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentID=" + studentID +
                '}';
    }
}
