package AleMele_month$$;

import java.util.Scanner;

/**
 Write a program that will look up a user.

 Assume that you have only 2 users: Max Payne and Alan Wake.
 First, ask user to enter full name. Display message: "Enter full name:". Then take input from user.
 If name is equals to either "Max Payne" or "Alan Wake", display message: "User found!".
 Otherwise, display message: "User not found!". Please make your search case insensitive!

 Example:

 Display message: Enter full name:
 Display message: Enter full name:
 input: Max Payne
 input: Max Payne
 Display message: User found!
 */
public class FindAUser {
    public static void main(String[] args) {
        String user1 = "Max Payne";
        String user2 = "Alan Wake";

        Scanner s = new Scanner(System.in);
        System.out.println("Enter full name:");
        String fullName = s.nextLine();

        if (fullName.equalsIgnoreCase("Max Payne") || fullName.equalsIgnoreCase(user2)){
            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
        }
    }
}
