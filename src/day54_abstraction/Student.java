package day54_abstraction;

public abstract class Student {
    public void code(String language){
        System.out.println("Student is coding using " + language);
    }

    public abstract void attendClass();
}

class OnlineStudents extends Student{ //This class is considered to be concrete class. It is responsible to implement all abstract methods
    //attendClass abstract method is implemented by the subclass
    @Override
    public void attendClass(){
        System.out.println("Online students attending the class using Zoom");
    }

//    public abstract void askQuestions(); ERROR
}

class CampusStudents extends Student{
    @Override
    public void attendClass() {
        System.out.println("Campus student is attending the class in person");
    }
}


class School{
    public static void main(String[] args) {
//        Student student = new Student(); ERROR - can not create object from abstract class

        OnlineStudents onlineStudents =  new OnlineStudents();
        onlineStudents.attendClass();

        CampusStudents campusStudents = new CampusStudents();
        campusStudents.attendClass();
    }
}
