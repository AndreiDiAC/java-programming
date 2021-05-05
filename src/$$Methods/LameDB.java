package $$Methods;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LameDB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));

    }

    public static String lameDb( String db, String op, String id, String data){

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(db.split("#")));
        ArrayList<String> newArrayList = new ArrayList<>();
        for(String word : arrayList){
            newArrayList.add(word.substring(1));
        }
        int idNumber = Integer.parseInt(id) - 1;


        if(op.equals("add")){
            newArrayList.add(idNumber,data);
        }else if(op.equals("edit")){
            newArrayList.set(idNumber,data);
        }else if(op.equals("delete")){
            newArrayList.remove(idNumber);
        }

        for( String each : newArrayList){
            newArrayList.set(newArrayList.indexOf(each),"" + (newArrayList.indexOf(each)+1) + each);
        }

        return String.join("#",newArrayList.toArray(new String[newArrayList.size()]));
    }
}
