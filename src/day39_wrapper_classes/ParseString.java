package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String total = "345";
        int count  =  Integer.parseInt(total);
        System.out.println("count = " + count);

        String strPrice = "123.5";
        if(Double.parseDouble(strPrice) >100){
            System.out.println("More then 100");
        }
        String sentence = "I wrote 100 lines of code";
        String[] arr = sentence.split(" ");
        int linesOfCode = Integer.parseInt(arr[2]);
//        int linesOfCode = Integer.parseInt(sentence.split(" ")[2]);
        System.out.println(linesOfCode);


    }
}
