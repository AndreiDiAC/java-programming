package AleMele_month$$$.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class a {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123" , "54", "24"));

        for(int i= 0; i < list.size(); i++) {
            int totalSum = 0;
            for (int j = 0; j < list.get(i).length();j++){ // [1, 2, 3]
                totalSum += Integer.parseInt("" + list.get(i).charAt(j));
            }
            //System.out.println(list);
            list.set(i, "" + totalSum);

        }

        System.out.println(list);
    }
}
