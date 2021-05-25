package $$Methods;

public class Pangram {
    public static void main(String[] args) {
        System.out.println(isPangram("A quick brown fox jumps over the lazy dog."));
        System.out.println(isPangram("Back in June we delivered oxygen equipment of the same size."));
    }

    public static boolean isPangram(String string){
        String pangram = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for(int i = 0; i < pangram.length();i++){
            if(!string.toUpperCase().contains("" + pangram.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
