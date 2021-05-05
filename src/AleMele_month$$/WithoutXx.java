package AleMele_month$$;

public class WithoutXx {
    public static void main(String[] args) {
        String word = "xJavax";
        if(word.toLowerCase().startsWith("x") && word.toLowerCase().endsWith("x")){
            System.out.println(word.substring(1,word.length()-1));
        }else if(word.toLowerCase().startsWith("x")){
            System.out.println(word.substring(1));
        }else if(word.toLowerCase().endsWith("x")){
            System.out.println(word.substring(0,word.length()-1));
        }else{
            System.out.println(word);
        }
    }
}
