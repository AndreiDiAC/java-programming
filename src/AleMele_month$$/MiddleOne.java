package AleMele_month$$;

/**
 You have a word, do the following:

 When word has odd number of characters and:
 3 or more characters, print middle letter
 oak ==> a
 oak ==> a
 javav ==> v
 javav ==> v
 Single character, print that character 3 times
 # ==> ###
 # ==> ###
 q ==> qqq
 q ==> qqq
 When word has even number of characters and:
 4 or more characters, print the middle 2 characters
 java ==> av
 java ==> av
 apples ==> pl
 apples ==> pl
 #$%^&* ==> %^
 #$%^&* ==> %^
 2 characters, print those 2 characters twice
 @@ ==>@@@@
 @@ ==>@@@@
 $$ ==>$$$$
 $$ ==>$$$$
 hi ==> hihi
 */
public class MiddleOne {
    public static void main(String[] args) {
        String word = "avwe";
        if(word.length()==1){
            System.out.println("" + word + word + word);
        }else if(word.length() % 2 != 0){
            System.out.println(word.charAt(word.length()/2));
        }else if(word.length() == 2){
            System.out.println("" + word + word);
        }else if(word.length() %2 == 0){
            System.out.println(word.charAt(word.length()/2-1) + "" + word.charAt(word.length()/2));
        }
    }
}
