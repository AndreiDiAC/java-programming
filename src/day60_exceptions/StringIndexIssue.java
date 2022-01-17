package day60_exceptions;

public class StringIndexIssue {
    public static void main(String[] args) {

        try{
            String word = "java";
            System.out.println("word = " + word);
            System.out.println(word.charAt(10));
        }catch (Exception e){
            System.out.println("Exception happened and caught");
            System.out.println("Reason = " + e.getMessage());
        }

        String word2 ="Selenium";
        try{
            System.out.println("word2 = " + word2);
            System.out.println(word2.substring(0,5));
            System.out.println(word2.substring(0,15));
        }catch (Throwable e){
            System.out.println("Type of exception: " + e.getClass().getSimpleName());
            System.out.println("Reason: " + e.getMessage());
        }



    }
}
