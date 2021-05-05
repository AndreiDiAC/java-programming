package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("java",3,'|'));
        System.out.println(repeatString("hi", 5,'~'));
    }

    public static String repeatString(String word, int times, char delimiter){
        String result = "";
        for( int i = 0; i < times; i++){
            result += word  + delimiter;
        }
        return result.substring(0,result.length()-1);
    }
}
//taking care about te last delimiter. Another way:
/*
if(i == times){
    result += word;
}else{
    result += word + delimiter;
 */