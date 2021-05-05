package $$Methods;

public class Signum {
    public static void main(String[] args) {
        sign(0);
    }

    public static void sign(int n){
        if(n > 0){
            System.out.println("positive");
        }else if(n == 0){
            System.out.println("zero");
        }else{
            System.out.println("negative");
        }
    }
}
