package day33_arrays;

import java.util.Arrays;

public class SplitCatingLength {
    public static void main(String[] args) {
        String word = "hello_world";
        String[] strArr = word.split("_");
        System.out.println(Arrays.toString(strArr));   // [hello, world]

        String a = "https://en.wikipedia.org/wiki/Pseudocode";
        String[] aArr = a.split("/");
        System.out.println(Arrays.toString(aArr));    //   [https:, , en.wikipedia.org, wiki, Pseudocode]


        String b = "java program";
        String[] bArr = b.split("a");
        System.out.println(Arrays.toString(bArr)); //    [j, v,  progr, m]
        System.out.println(bArr.length-1); // 3      How many a in b?    b.length-1;           4 peaces, 3 cuts



        String c = "java";
        String[] cArr = c.split("a");
        System.out.println(Arrays.toString(cArr)); // [j, v]

//DO NOT USE THIS APPROACH
        String word2 ="java";
        String[] array = word2.split("a");
        System.out.println(array.length); //2
        int countOfA = array.length-1;
        if(word2.endsWith("a")){
            countOfA++;
        }
        System.out.println("countOfA = " + countOfA); //


        System.out.println("SPLIT BY EMPTY");
        String orice = "java";
        String[] oriceArr = orice.split("");
        System.out.println(Arrays.toString(oriceArr));  //  [j, a, v, a]

    }
}
