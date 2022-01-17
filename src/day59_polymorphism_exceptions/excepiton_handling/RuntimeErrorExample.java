package day59_polymorphism_exceptions.excepiton_handling;

/**
 * RUNTIMEEXCEPITON happens in below code, code compiles fine and during execution it fails
 * 10 / 0 -> ArithmeticException can not / by 0
 */

public class RuntimeErrorExample {
    public static void main(String[] args) {
        System.out.println(10 / 2);
        System.out.println(10 / 0);
        System.out.println(10 / 3);

        int [] nums = {4,6,10};
        System.out.println(nums[0]);
        System.out.println(nums[3]); // -> ArrayIndexOutOfBoundException 3
    }
}
