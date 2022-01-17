package day61_exceptions_colLections.Exceptions;

public class ElementaryStudent {
    private String name;
    private int age;

    public ElementaryStudent(){

    }

    public ElementaryStudent(String name, int age){
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //check if name is null first, otherwise we might get NullPointerException
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty or null");
        }
        // if is all numbers. or starts with number
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 5 || age > 12){
            throw new IllegalArgumentException("Age cannot be less then 5 and more then 12");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "ElementaryStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
