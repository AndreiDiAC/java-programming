package $$Methods;

public class coverString {
    public static void main(String[] args) {
        System.out.println(coverString("java methods","me"));
    }

    public static String coverString(String main, String coverMe){
        String newMain = "";
        if(main.contains(coverMe)){
            newMain = main.replace(coverMe,"[" + coverMe + "]");
        }else{
            newMain = "[" + main + "]";
        }
        return newMain;



    }
}
