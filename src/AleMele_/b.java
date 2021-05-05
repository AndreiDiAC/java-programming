package AleMele_;
import java.util.*;
public class b {
    public static void main(String[] args) {
        String[] mystring = {
                "this is string one",
                "this is string two",
                "this is string three",
                "this is string four",
                "this is string five"
        };

        int idx = new Random().nextInt(mystring.length);
        String random = (mystring [idx]);
        System.out.println(random);
    }
}
