package AleMele_month$$.Arrays_4_10;

/**
 [IQ] Longest Palindrome
 Given a String array. Find the longest Palindrome String in your array.
 Ex:
 Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”]
 Output: racecar
 Ex:
 Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
 Output: No palindrome
 */
public class LongestPalindrome {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int size = s.nextInt();
//        String[] words = new String[size];
//        for (int i = 0; i < size;i++){
//            words[i] = s.nextLine();
//        }
        String[] words = {"java","longer word","civic","apple","racecar","mom","anna"};
//        String[] words = {"abc","dna","kevin","joe","lamp"};



        String reverse = "";
        String palindrome = "";
        String longest = "";
        for (int i = 0; i < words.length; i++) {

            reverse = "";

            for (int l = words[i].length()-1; l >= 0; l--) {
                reverse += words[i].charAt(l);
                if(words[i].equals(reverse)){
                    palindrome = words[i];
                    if(longest.length() < palindrome.length() ){
                        longest = palindrome;
                    }
                }
            }
        }

        System.out.println(palindrome.isEmpty() ? "No palindrome" : longest);
    }
}
