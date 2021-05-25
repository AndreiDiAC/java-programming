package $$Methods;
import day43_list_custom_classes.Employee;

import java.util.*;
public class TicTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char [] game = new char[9];
        for(int i=0; i < game.length; i++) {
            game[i] = in.next().charAt(0);
        }
        System.out.println(game);

        System.out.println(won(game));
    }

    public static String won(char [] game){
        String winner = "";

        if(     game[0] == 'X' && game[1] == 'X' && game[2] == 'X' ||
                game[3] == 'X' && game[4] == 'X' && game[5] == 'X' ||
                game[6] == 'X' && game[7] == 'X' && game[8] == 'X' ||
                game[0] == 'X' && game[4] == 'X' && game[8] == 'X' ||
                game[2] == 'X' && game[4] == 'X' && game[6] == 'X' ||
                game[0] == 'X' && game[3] == 'X' && game[6] == 'X' ||
                game[1] == 'X' && game[4] == 'X' && game[7] == 'X' ||
                game[2] == 'X' && game[5] == 'X' && game[8] == 'X'){

            winner = "Player X won";
        }else if(game[0] == 'O' && game[1] == 'O' && game[2] == 'O' ||
                game[3] == 'O' && game[4] == 'O' && game[5] == 'O' ||
                game[6] == 'O' && game[7] == 'O' && game[8] == 'O' ||
                game[0] == 'O' && game[4] == 'O' && game[8] == 'O' ||
                game[2] == 'O' && game[4] == 'O' && game[6] == 'O' ||
                game[0] == 'O' && game[3] == 'O' && game[6] == 'O' ||
                game[1] == 'O' && game[4] == 'O' && game[7] == 'O'||
                game[3] == 'O' && game[5] == 'O' && game[8] == 'O'){
            winner = "Player O won";
        }else {
            winner = "Nobody won";
        }
        return winner;
    }
}
