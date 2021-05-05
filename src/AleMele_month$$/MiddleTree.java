package AleMele_month$$;

public class MiddleTree {
    public static void main(String[] args) {
        String word = "fifteen";
        if(word.length() %2 !=0 && word.length() >=5){
            System.out.println(word.substring(word.length()/2 -1, word.length()/2 +2));
        }else{
            System.out.println("invalid");
        }
    }
}
