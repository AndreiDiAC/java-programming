package AleMele_month$$;

/**
 Given a String message with some text and a number (1-3) replace certain characters from the String message.

 When the number is:
 1: replace 'a' with 'e'
 2: replace 's' with 'r'
 3: replace 'o' with 'z'


 Ex:
 message: java class is fun
 number: 1
 Output: jeve cless is fun

 Ex:
 message: java class is fun
 number: 2
 Output: java clarr ir fun
 */
public class Replace {
    public static void main(String[] args) {
        String a = " java class is fun";
        int number = 1;
        if (number == 1){
            System.out.println(a.replace("a","e"));
        }else if(number == 2){
            System.out.println(a.replace("s","r"));
        }else if(number ==3){
            System.out.println(a.replace("o","z"));
        }
    }
}
