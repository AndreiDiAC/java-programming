package AleMele_month$$;

/**
 A sandwich is two pieces of bread with something in between.
 Print the string that is between the first and last appearance of "bread" in the given string, or return string "nothing"
 if there are not two pieces of bread.

 Example:

 input: breadjambread

 output: jam
 input: breadjambread

 output: jam
 input: xxbreadjambreadyy

 output: jam
 input: xxbreadjambreadyy

 output: jam
 input: xxbreadapple

 output: nothing
 input: xxbreadapple

 output: nothing
 input: breadbutterbread

 output: butter
 */
public class Sandwich {
    public static void main(String[] args) {
        String str = "aba";
        int firstIndex = str.indexOf("bread"); //-1
        int lastIndex = str.lastIndexOf("bread");
        if(firstIndex != lastIndex){
            System.out.println(str.substring(firstIndex+5,lastIndex));
        }else{
            System.out.println("nothing");
        }
    }
}
