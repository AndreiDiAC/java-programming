package AleMele_month$$;

public class SaimWayforLargerAndContainsA {
    public static void main(String[] args) {
        String word1 = "java";
        String word2 = "mouse";
        String word3 = "apple";
        String isBigger = "";
        String a = "a";

        if(word1.contains(a) && word1.length() > isBigger.length()){
            isBigger = word1;
        }
        if(word2.contains(a) && word2.length() > isBigger.length()){
            isBigger = word2;
        }
        if(word3.contains(a) && word3.length() > isBigger.length()){
            isBigger = word3;
        }
        System.out.println(isBigger);
    }
}
