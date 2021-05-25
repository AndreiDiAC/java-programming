package AleMele_;
import java.util.*;
/**
 1. We need to create a program using a two-dimension array
 2. we have two player which are X and O .
 3. we need to execute which one should start first randomly .
 4. The program is to read a number from 1 to 9 from the keyboard alternating between the     X and the O
 5. Ask which square the X player wants, and then ask which square the O player wants
 6. Continue until the game is won by either player, or all the squares have been filled.     (Called Tie Game)
 7. we need custom method to update board table
 8. if one square taken by one player, the square can not be used again and if
 player choose that one we should say: "this square has been already taken. Pleas choose another one"
 */

public class tikTakToe {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to Tik-Tak-Toe!!!");
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        String [] arr = new String[2];
        System.out.println("Enter first player name:");
        arr[0] = s.next();
        System.out.println("Enter second player name:");
        arr[1] = s.next();
        int random = r.nextInt(arr.length);
        String player1; String player2;
        if(arr[random] == arr[0]){
            player1 = arr[0];
            player2 = arr[1];
        }else{
            player1 = arr[1];
            player2 = arr[0];
        }
        System.out.print("Random choose... ");
        for (int i = 3; i > 0;i--){
            Thread.sleep(1000);
            System.out.print(i + ".. ");
        }
        System.out.println();
        System.out.println();
        System.out.println("First Player = X :\t " + player1);
        System.out.println();
        System.out.println(player1 + ", please choose a free spot in: ");

        for (int i = 5; i > 0;i--){
            Thread.sleep(1000);
            System.out.print(i + ".. ");
        }
        System.out.println();
        System.out.println();




        char [][] letterArr = new char[3][3];
        System.out.println("   0   1   2  - column");
        for (int i = 0, l = 0; i < letterArr.length;i++, l++){
            System.out.print(l + " |");
            for (int j = 0; j < letterArr[i].length;j++){
                System.out.print(" "+letterArr[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("|");
        System.out.println("row");
        System.out.println();

        System.out.println("Enter column number!");
        int colNum = s.nextInt();
        System.out.println("Enter row number");
        int rowLet = s.nextInt();

        letterArr[colNum][rowLet] = 'x';

        System.out.println(Arrays.deepToString(letterArr));
        table();





        char [] emptyArr = new char[10];
        System.out.println(Arrays.toString(emptyArr));
        for( int each: emptyArr){
            for( int i = 0; i < letterArr.length;i++){
                for (int j = 0; j < letterArr.length;j++){

                }
            }
        }











    }


    public static void table(){
        char [][] letter = new char[3][3];
        System.out.println("   A   B   C");
        for (int i = 0, l = 1; i < letter.length;i++, l++){
            System.out.print(l + "|");
            for (int j = 0; j < letter[i].length;j++){
                System.out.print(" "+letter[i][j] + " | ");
            }
            System.out.println();
            System.out.println("");
        }
    }

    public static void fullTable(){
        char [][] lett = {{'x','o','x'},{'o','x','o'},{'o','x','o'}};


        for (int i = 0; i < lett.length;i++){
            for (int j = 0; j < lett[i].length;j++){
                System.out.print(lett[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void choosePlayer() throws InterruptedException{
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        String [] arr = new String[2];
        System.out.println("Enter first player:");
        arr[0] = s.next();
        System.out.println("Enter second player:");
        arr[1] = s.next();
        int random = r.nextInt(arr.length);
        String player1; String player2;
        if(arr[random] == arr[0]){
            player1 = arr[0];
            player2 = arr[1];
        }else{
            player1 = arr[1];
            player2 = arr[0];
        }
        System.out.print("Random choose... ");
        for (int i = 3; i > 0;i--){
            Thread.sleep(1000);
            System.out.print(i + ".. ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Player X => " + player1);
        System.out.println("Player 0 => " + player2);
    }



}
