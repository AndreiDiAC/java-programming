package $$Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class BlogPostDb {
    public static void main(String[] args) {
        String [] a = {"1","title","content1"};
        String [] b = {"2","another title","content2"};
        String [] c = {"3","yet another title","content3"};
        System.out.println(blogDb(new ArrayList<>(Arrays.asList(a, b, c)),"1"));
    }

    public static String blogDb(ArrayList<String[]> r, String id){
        String title ="";
        String content ="";
        for(String [] each : r){
            if(id.equals(each[0])){
                for( int i = 1; i < each.length;i++){
                    if(i == each.length-1){
                        title += each[i];
                    }else {
                        title += each[i] + "\n";
                    }
                }
            }
        }
        return title;
    }
}
