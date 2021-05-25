package day43_list_custom_classes;
import java.util.Random;
import java.util.*;

public class ListMethods {
    public static void main(String[] args) {
        System.out.println(getDays());
        System.out.println("Get list size = " + getDays().size());
        System.out.println(getDays().get(0));
        List<String> dayName = getDays();
        dayName.removeIf( day -> day.length() == 6);
        System.out.println(dayName);

        System.out.println(getRandomList(10));

    }

    public static List<String> getDays(){
//        List<String> list = new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday",
//                "Friday","Saturday","Sunday"));

//        List<String> list = new ArrayList<>(Arrays.asList("Monday, Tuesday, Wednesday, Thursday, " +
//                "Friday, Saturday, Sunday"));

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Monday","Tuesday","Wednesday","Thursday",
                "Friday","Saturday","Sunday"));
        return list;

    }

    public static List<Integer> getRandomList(int size) {
        Random random = new Random(); //new Random object
        List<Integer> nums = new ArrayList<>();
        for(int i = 1; i <= size; i++) {
//            int n = random.nextInt(101);
//            if(!nums.contains(n)) {
//                nums.add(n);
//            }
            nums.add(random.nextInt(101)); //generate random 0-100 limit number and add to list
        }
        return nums;
    }
}

