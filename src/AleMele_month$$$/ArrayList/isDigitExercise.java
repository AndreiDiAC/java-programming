package AleMele_month$$$.ArrayList;

public class isDigitExercise {
    public static String extractNum(String s){
        String extractNum ="";
        for(int i = 0; i< s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                extractNum += s.charAt(i);
            }
        }
        return extractNum;
    }

    public static void main(String[] args) {
        System.out.println(extractNum("aa2aa3"));
    }
}
