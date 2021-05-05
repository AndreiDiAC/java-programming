package AleMele_;
import  java.util.Scanner;
public class BlackJack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int player = s.nextInt();
        int house = s.nextInt();
        if (player > 21){
            System.out.println("player busts");
        }else if(player< house){
            System.out.println("player loss");
        }else if(player == house){
            System.out.println("its a tie");
        }else if(player>house){
            System.out.println("player win");
        }
    }
}
