package __practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InterviewQuestions {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,35,2,1));

        int [ ] arr = {1,322,42,2,51,1,1};

        Set<Integer> set =  new HashSet();
        for(int each: arr){
            set.add(each);
        }
        System.out.println("set = " + set);

    }
}
