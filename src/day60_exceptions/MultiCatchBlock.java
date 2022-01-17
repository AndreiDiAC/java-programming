package day60_exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {
//        String word = "java";
        String word = null;
        try{
            System.out.println(10/0);
            System.out.println("length = " + word.length());
            System.out.println("length = " + word.length());
            System.out.println(word.substring(20));
        }catch (NullPointerException e){
            System.out.println("NullPointerException caught and handled, please check if String has value");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Index is wrong, please check if you entered a valid index");
        }catch (Throwable t){
            System.out.println("Exception is caught ");
            System.out.println("Reason: " + t.getMessage());
        }

    }
}
