package AleMele_month$$.CodingBat;

/**
 Given a string, return a new string where "not " has been added to the front. However,
 if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
 */
public class NotString {
    public static void main(String[] args) {
        String str = "blah";



            if(!str.startsWith("not")) {
                System.out.println("not " + str);
            }
            if(str.startsWith("not")){
                System.out.println(str);

        }
    }
}
