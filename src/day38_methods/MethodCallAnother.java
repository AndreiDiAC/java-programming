package day38_methods;

public class MethodCallAnother {
    public static void start(){
        System.out.println("start");
        conitnue();
    }

    public static void conitnue(){
        System.out.println("continue");
        end();
    }

    public static void end(){
        System.out.println("end");

    }


    public static void main(String[] args) {
        start();
        conitnue();
        end();
    }
}
