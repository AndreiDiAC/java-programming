package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(50,35));
        System.out.println(Integer.min(5, 2));
        System.out.println("Min int: " + Integer.MIN_VALUE);
        System.out.println("Max int: " + Integer.MAX_VALUE);

        System.out.println(Double.max(234.4,23.9));
        System.out.println("MAX DOUBLE: " + Double.MAX_VALUE);
        System.out.println("MIN DOUBLE: " + Double.MIN_VALUE);


        System.out.println(Double.compare(5, 2)); //1 - first larger then second
        System.out.println(Double.compare(5,5));  //0 - both equal
        System.out.println(Double.compare(2,5));  //-1 -first is smaller then second


        System.out.println(Character.isDigit('8')); //true
        System.out.println(Character.isDigit('v')); //false
        System.out.println(Character.isAlphabetic('v')); //true
        System.out.println(Character.isLetter('a')); // true
        System.out.println(Character.isUpperCase('B')); //true
        char letter = 'A';
        System.out.println("IS letter LETTER? "+Character.isLetter(letter));
        if(Character.isUpperCase(letter)){
            System.out.println("it is uppercase");
        }
        String word = "JaVa iS FuN";
        for (int i = 0; i < word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                System.out.print(word.charAt(i));
            }
        }
        System.out.println();
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);

        String a = "12345";
        int num = Integer.parseInt(a);
        int num2 = Integer.valueOf(a);
        System.out.println(Integer.valueOf(a));
        System.out.println(Integer.parseInt(a));
        System.out.println(num + num2);

        String strPrice = "123.99";
        double price = Double.parseDouble(strPrice);

    }
}
