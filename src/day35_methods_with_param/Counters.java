package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        countUntill(5);
        countUntill(2);
        int num = 999;
        countUntill(num);
        String word = "wooden spoon";
        countUntill(word.length());

        printAge(1991);
    }

    public static void countUntill(int num){
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * method name: printAge
     * @param year
     * "Birth year: 1984. Age: 38"
     */
    public static void printAge(int year){
        System.out.println("Birth year: "+ year + ". Age: " + (2021 - year) );
    }


}
