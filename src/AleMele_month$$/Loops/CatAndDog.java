package AleMele_month$$.Loops;

/**
 * Print true if the string "cat" and "dog" appear the same number of times in the given string word.
 * <p>
 * Example:
 * <p>
 * input: catdog
 * output: true
 * input: catdog
 * output: true
 * Example:
 * <p>
 * input: catcat
 * output: false
 * input: catcat
 * output: false
 * Example:
 * <p>
 * input: cat-cheetah-dog-cat
 * output: false
 */
public class CatAndDog {
    public static void main(String[] args) {
        String word = "x";

        int countOfCats = 0;
        int countOfDogs = 0;
        for (int i = 0; i < word.length()-2; i++){
            String part = word.substring(i,i+3);
            if(part.equals("cat")){
                countOfCats += 1;
            }else if(part.equals("dog")){
                countOfDogs += 1;
            }
        }
        if(countOfCats == 1 && countOfDogs == 1) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
