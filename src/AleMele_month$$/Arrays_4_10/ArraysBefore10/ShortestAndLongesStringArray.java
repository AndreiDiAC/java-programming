package AleMele_month$$.Arrays_4_10.ArraysBefore10;

public class ShortestAndLongesStringArray {
    public static void main(String[] args) {
        String[] str = {"banana","cake","anything"};
        String max = str[0];
        for(String each: str){
            if(each.length() > max.length()){
                max = each;
            }
        }
        System.out.println(max);

        String min = str[0];
        for(String each : str){
            if(each.length() < min.length()){
                min = each;
            }
        }
        System.out.println(min);
    }
}
