package AleMele_month$$.orice;

public class Methodes {
    public static void main(String[] args) {
        System.out.println(sumDouble(2,2));

        System.out.println(caps("anything"));

    }

    public static int sumDouble(int a, int b) {
        if(a == b){
            return (a+b)*2;
        }else{
            return a+b;
        }
    }


    public static String caps(String s){
        return s.toUpperCase();
    }



}
