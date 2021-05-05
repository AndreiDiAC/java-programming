package $$Methods;
import java.util.Scanner;
public class InsertString2atIndex3 {
    public static String at3(String target,String word){
        String result = "";
        for ( int i = 0; i < target.length(); i++){
            if(i==3){
                result += word + target.charAt(i);
            }else{
                result+= target.charAt(i);
            }
        }
        return result;


}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(at3(in.next(), in.next()));
    }
}
