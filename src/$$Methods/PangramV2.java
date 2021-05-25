package $$Methods;

public class PangramV2 {
    public static void main(String[] args) {
        System.out.println(isPangram("Back in June we delivered oxygen equipment of the same size."));
    }

    public static boolean isPangram(String string){
        String pangram = "";
        for (int i = 0; i < string.length(); i++){
            if(!pangram.contains("" + string.charAt(i)) && Character.isLetter(string.charAt(i))){
                pangram += "" + string.charAt(i);
            }
        }

        return pangram.length() == 26;
    }
}
