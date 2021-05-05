package AleMele_month$$.Arrays_4_10;
import java.util.*;
public class ZombieAttack2Mohammed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};


        int[] zeroArray = new int[inhabitants.length]; // to compare with my original array

        // creat a copy of my original array saved attacked on this array
        int[] attacked = Arrays.copyOf(inhabitants, inhabitants.length);
        int day = 0; // start day

        // if my original array == Zero array (all index become zero) ==> EXIT THE LOOP
        while (!(Arrays.toString(inhabitants).equals(Arrays.toString(zeroArray)))) {

            // print day 0 with original array without any change
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            day++;

            for (int i = 0; i < inhabitants.length; i++) {

                // if we are in the first round of the loop and index[i] is zero
                // then zombie will attack to next index
                if (i == 0 && inhabitants[i] == 0) {

                    // inhabitants become half
                    attacked[i + 1] /= 2;
                    //we are in last round of the loop and index[i] is zero
                    // then Zombie will attack the index right before my index[i]
                } else if (i == inhabitants.length - 1 && inhabitants[i] == 0) {
                    // inhabitants become half
                    attacked[i - 1] /= 2;

                    //when index[i] is zero but we are not at the first and at the last round of the loop
                    // we are in middle
                } else if (inhabitants[i] == 0) {
                    // Zombie will attack to index one before and also one after my index[i]
                    attacked[i - 1] /= 2;
                    attacked[i + 1] /= 2;
                }
            }

            // now we need to save all attacks from index attacked to my original index (array inhabitants)
            for (int i = 0; i < inhabitants.length; i++) {
                inhabitants[i] = attacked[i];
            }
        }
        // out side the loop print the statement when all of the index from my original array become zero
        System.out.println("Day " + day++ + " " + Arrays.toString(zeroArray));
        System.out.println("---- EXTINCT ----");
    }
}
