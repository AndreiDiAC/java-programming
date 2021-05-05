package AleMele_month$$.Loops;

import java.util.Scanner;

/**
 Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)

 Ask for the first guest name.

 Then ask does user want to enter one more guests.

 If yes - take the next guest input

 If not - finish the program and print list of the guests.

 Example:

 Please enter guest name:
 Nick
 Do you want to enter new guest name:
 yes
 Please enter guest name:
 Linda
 Do you want to enter new guest name:
 no
 Guest's list: Nick, Linda
 */
public class Party {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int loop = 1;
        String storage = "";
        String coma = "";
        while(loop <=1){
            System.out.println("Please enter guest name:");
            String name = s.next();
            storage += coma + name;
            coma = ", ";
            System.out.println("Do you want to enter new guest name?");
            String answer = s.next();
            if(answer.equals("yes")){
            }else if(answer.equals("no")){
                System.out.println("Guest's list: " + storage);
                return;
            }
        }

    }
}
