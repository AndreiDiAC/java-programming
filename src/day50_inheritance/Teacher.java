package day50_inheritance;

public class Teacher extends Person {
    int teacherID;

    public void teach(String topic){
        System.out.println("Teacher is teaching " + topic);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", teacherID=" + teacherID +
                '}';
    }
}
