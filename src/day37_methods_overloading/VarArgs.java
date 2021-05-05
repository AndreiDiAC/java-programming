package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(1,2,3,4,5,6,7,84,3);
        addNumbers(1,2,3,4,1,2,2,4,2,2,1,2,4,2,3,5,1,25,5,756,4,452,1,343,6,72);
        addNumbers(); // 0
    }

    public static void addNumbers(int... nums){
        //inside the method, it is used as regular array
        int sum = 0;
        for (int n: nums){
            sum += n;
        }
        System.out.println("sum = " + sum);
    }
}
