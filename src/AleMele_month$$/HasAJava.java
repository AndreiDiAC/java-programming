package AleMele_month$$;

public class HasAJava {
    public static void main(String[] args) {
        String word = "b";

        if (word.toLowerCase().indexOf("java") == 0 || word.toLowerCase().indexOf("java") == 1) {
            System.out.println("true");
        } else if (word.toLowerCase().indexOf("java") != 0 || word.toLowerCase().indexOf("java") != 1) {
            System.out.println("false");
        }
    }
}
// OUT OF BOUND when string is just o character
//        if(word.charAt(0)=='j' || word.charAt(1)=='j'||word.charAt(1) == 'j' || word.charAt(1)== 'j'){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }

