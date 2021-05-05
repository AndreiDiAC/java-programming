package day29_nestedloop_arrays;

public class CountCharsNestedLoop {
    public static void main(String[] args) {
        String word = "java", storage = "";


        for (int outer = 0; outer < word.length(); outer++) {
            int count = 0; //reset count to 0
//            System.out.println("outer " + word.charAt(outer));
            for (int inner = 0; inner < word.length(); inner++) {
//                System.out.println(word.charAt(inner));
                if (word.charAt(outer) == word.charAt(inner)) {
                    count++;
                }
            }
            if (!storage.contains(word.charAt(outer) + "")) {
                storage += word.charAt(outer) + " = " + count + "\n";
            }
        }
        System.out.println(storage);
    }
}
