package day38_methods;

public class StringsUtils {
    public static void main(String[] args) {

        System.out.println("isNullOrEmpty() = " + isNullOrEmpty("asd"));
        String word =null;
        System.out.println("isNullOrEmpty() = " + isNullOrEmpty(word));
        word = "";
        System.out.println("isNullOrEmpty() = " + isNullOrEmpty(word));

    }


    public static boolean isNullOrEmpty(String str){
        if (str == null || str.isEmpty()){
//        !X      str.isEmpty() || str == null       <== NullPointerException  pt ca || verifica doar prima contidie
//        if you do it this way and the String is holding a null value it is like you are trying null.isEmpty()
//        and this is not valid because null is not a String object
            return true;
        }else{
            return false;
        }

    }


    public static String reverse(String str){
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

}
