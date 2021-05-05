package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fan";
        String[] words = sentence.split(" ");
        System.out.println("1st word = " + words[0]);
        System.out.println("2nd word = " + words[1]);
        System.out.println("3rd word = " + words[2]);
//        System.out.println(words[3]);    out of bound
        for(String w: words){
            System.out.println(w);
        }
        //--------------------------------------------------
        String googleResult = "about 1,810,000 results (0.68 seconds)";
        String[] word = googleResult.split(" ");
        System.out.println(word[1]); //    1,810,000
        System.out.println(word[3].substring(1)); //0,68
        System.out.println(word[3].replace("(","")); //0,68
        //-------------------------------------------------------
        // How many cat word in the sentence
        String catType = "bengal cat tabby cat persian cat no cat here";
//        System.out.println(catType.split(" cat ").length -1);
        int count =0;
        for(int i = 0; i < catType.length()-2; i++){
            if(catType.substring(i,i+3).equals("cat")){
                count++;
            }
        }

        System.out.println("cat word in sentence = " + count);
        System.out.println();

        //or
        String[] catsArray = catType.split("cat");
        System.out.println("numbers of cat = " + (catType.length()-1));


    }
}
