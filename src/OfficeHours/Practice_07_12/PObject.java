package OfficeHours.Practice_07_12;

public class PObject {
    public static void main(String[] args) {

        PA obj1 = new PA();
        Object obj2 = new PA();
        obj1.go();
        ((PA)obj2).go();

        PB obj3 = new PC();
        obj3.go();
        ((PC)obj3).math();
        ((PI)obj3).math();


        PB obj4 = new PB();
        obj4.go();
        ((PA)obj4).go();
        ((PI)obj4).math();



    }
}
