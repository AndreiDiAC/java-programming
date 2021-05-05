package day27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "gitgihubi";
        char letter = 'i';
        int index = -1;
        String storage ="";
        String and = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                index = i;
                storage += and + index;
                and = " and ";

            }
        }
        if (index == -1) {
            System.out.println(letter + " is not found");
        }else{
            System.out.println(letter + " is found at index " + storage);
        }
    }
}
