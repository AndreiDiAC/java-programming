package day28_loops;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOQPRSTUVWXYZabcdefghijklmnoqprstuvwxyz0123456789_!@#$%^&*";
        Random random = new Random();

        String password = "";

        for (int i = 1; i <= 8; i++) {
            int index = random.nextInt(71);
            password += source.charAt(index);

            System.out.print(source.charAt(index) + " "); //random password
            //or
//            System.out.print(source.charAt(random.nextInt(source.length())));
//            System.out.println(random.nextInt(source.length()));
        }

        System.out.println("\n" + password);

    }
}
